package session16_lambda_functional_interface.challenges.create_pdf_from_json_16.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import session16_lambda_functional_interface.challenges.create_pdf_from_json_16.models.Resume;
import session16_lambda_functional_interface.challenges.create_pdf_from_json_16.services.PDFGeneratorService;
import session16_lambda_functional_interface.challenges.create_pdf_from_json_16.services.ResumeService;

import java.io.IOException;

@RestController
public class ResumeController {

    @Autowired
    ResumeService resumeService;
    @Autowired
    PDFGeneratorService pdfGeneratorService;

    @GetMapping("/makePdf")
    public void makePDFBro(@RequestBody Resume incoming, HttpServletResponse response) throws IOException, NoSuchFieldException {
        Resume resume = resumeService.createResume(incoming);
        pdfGeneratorService.makePDFBro(resume, response);
    }
}
