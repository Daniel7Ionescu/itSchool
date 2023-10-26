package session16_lambda_functional_interface.challenges.create_pdf_from_json_16.services;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;
import session16_lambda_functional_interface.challenges.create_pdf_from_json_16.models.Resume;
import session16_lambda_functional_interface.challenges.create_pdf_from_json_16.models.FieldName;

import java.io.IOException;

@Service
public class PDFGeneratorService {
    public void makePDFBro(Resume resume, HttpServletResponse response) throws IOException{
        //document will house all the stuff on the page
        Document document = new Document(PageSize.A4);
        //need to read some more on this,
        PdfWriter.getInstance(document, response.getOutputStream());
        //open and start adding stuff
        document.open();

        //setting up the title
        document.add(getFormattedTitle(resume.getTitle(), 22, "center"));
        //add personal details as subtitle
//        document.add(getFormattedTitle(resume.getClass().getField("personalDetails").getName(), 18, "left"));
        document.add(getFormattedTitle("Personal Details", 18, "left"));
        //add personal details body
        document.add(getShortField(FieldName.NAME, resume.getPersonalDetails().getName(), 14));
        document.add(getShortField(FieldName.ADRESS, resume.getPersonalDetails().getAdress(), 14));
        document.add(getShortField(FieldName.PHONE_NUMBER, resume.getPersonalDetails().getPhoneNumber(), 14));
        document.add(getShortField(FieldName.EMAIL, resume.getPersonalDetails().getEmail(), 14));
        //add objective
        document.add(getFormattedTitle("Objective", 18, "left"));
        document.add(getFormattedTextWall(resume.getObjective(), 14));
        //add education
        document.add(getFormattedTitle("Education", 18, "left"));
        document.add(getShortField(FieldName.UNIVERSITY, resume.getEducation().getUniversity(), 14));
        document.add(getShortField(FieldName.DEGREE, resume.getEducation().getDegree(), 14));
        document.add(getShortField(FieldName.GRADUATION_DATE, resume.getEducation().getGraduationDate(), 14));
        //add skills
        document.add(getFormattedTitle("Skills", 18, "left"));
        document.add(getFromStringArray(resume.getSkills(), 14));
        document.close();
    }

    private Paragraph getFromStringArray(String[] strArr, int fontSize) {
        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA);
        fontTitle.setSize(fontSize);

        //add the elements in the paragraph and add a new line after each element in array
        Paragraph paragraph = new Paragraph(fontSize);
        for (String textLine : strArr) {
            paragraph.add(textLine + "\n");
        }
        return paragraph;
    }

    private Paragraph getShortField(FieldName fieldName, String string, int fontSize) {
        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA);
        fontTitle.setSize(fontSize);
        return new Paragraph(fieldName.getAsText() + " : " + string, fontTitle);
    }

    private Paragraph getFormattedTextWall(String string, int fontSize) {
        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA);
        fontTitle.setSize(fontSize);

        Paragraph paragraph = new Paragraph(string, fontTitle);
        return paragraph;
    }

    private Paragraph getFormattedTitle(String string, int fontSize, String alignment) {
        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA);
        fontTitle.setSize(fontSize);

        Paragraph title = new Paragraph(string, fontTitle);
        if (alignment.equals("center")) {
            title.setAlignment(Paragraph.ALIGN_CENTER);
        } else if (alignment.equals("left")) {
            title.setAlignment(Paragraph.ALIGN_LEFT);
        }
        return title;
    }
}
