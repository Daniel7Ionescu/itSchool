package session16_lambda_functional_interface.challenges.create_pdf_from_json_16.models;

import lombok.Data;

@Data
public class Resume {
    private String title;
    private PersonalDetails personalDetails;
    private String objective;
    private Education education;
    private String[] skills;
}
