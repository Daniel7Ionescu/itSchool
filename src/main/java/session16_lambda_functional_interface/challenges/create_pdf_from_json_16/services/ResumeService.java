package session16_lambda_functional_interface.challenges.create_pdf_from_json_16.services;

import session16_lambda_functional_interface.challenges.create_pdf_from_json_16.models.Resume;

public interface ResumeService {

    Resume createResume(Resume incoming);
    boolean validateInput(Resume incoming);
}
