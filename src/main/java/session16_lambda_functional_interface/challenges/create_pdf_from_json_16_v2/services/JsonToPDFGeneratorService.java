package session16_lambda_functional_interface.challenges.create_pdf_from_json_16_v2.services;

import com.itextpdf.text.DocumentException;
import jakarta.servlet.http.HttpServletResponse;
import session16_lambda_functional_interface.challenges.create_pdf_from_json_16_v2.models.Resume;

import java.io.FileNotFoundException;

public interface JsonToPDFGeneratorService {

    void createPDF(Resume resume, HttpServletResponse response);
}
