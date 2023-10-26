package session16_lambda_functional_interface.challenges.create_pdf_from_json_16.models;


public enum FieldName {

    PERSONAL_DETAILS("Personal Details"),
    NAME("Name"),
    ADRESS("Adress"),
    PHONE_NUMBER("Phone Number"),
    EMAIL("Email"),
    OBJECTIVE("Objective"),
    EDUCATION("Education"),
    UNIVERSITY("University"),
    DEGREE("Degreee"),
    GRADUATION_DATE("Graduation Date"),
    SKILLS("Skills");

    private String asText;

    FieldName(String asText) {
        this.asText = asText;
    }

    public String getAsText() {
        return asText;
    }

    @Override
    public String toString() {
        return "ResumeChapter{}";
    }
}
