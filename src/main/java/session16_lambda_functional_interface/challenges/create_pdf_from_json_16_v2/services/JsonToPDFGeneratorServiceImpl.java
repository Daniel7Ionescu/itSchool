package session16_lambda_functional_interface.challenges.create_pdf_from_json_16_v2.services;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;
import session16_lambda_functional_interface.challenges.create_pdf_from_json_16_v2.models.Resume;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@Service
public class JsonToPDFGeneratorServiceImpl implements JsonToPDFGeneratorService {
    @Override
    public void createPDF(Resume resume, HttpServletResponse response) {
        Document document = new Document();

        Font titleFont = FontFactory.getFont(FontFactory.HELVETICA, 22, BaseColor.BLACK);

        try {
            PdfWriter.getInstance(document, new FileOutputStream("testPDF.pdf"));
            document.open();
            Chunk testChunk = new Chunk(resume.getTitle(), titleFont);
            document.add(testChunk);
        } catch (DocumentException | FileNotFoundException e) {
            System.out.println("so this just happened: " + e);
            throw new RuntimeException(e);
        } finally {
            document.close();
        }








    }
}
