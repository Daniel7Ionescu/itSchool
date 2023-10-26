package session16_lambda_functional_interface.challenges.create_pdf_from_json_16.services;

import org.springframework.stereotype.Service;
import session16_lambda_functional_interface.challenges.create_pdf_from_json_16.models.Resume;

@Service
public class ResumeServiceImpl implements ResumeService{
    @Override
    public Resume createResume(Resume incoming) {
        //check if incoming resume has certain field valid
        if(validateInput(incoming)) return incoming;
        //if not give a message
        System.out.println("Invalid incoming data");
        return null;
    }

    @Override
    public boolean validateInput(Resume incoming) {
        //check email
        if(!checkValidEmail(incoming.getPersonalDetails().getEmail())) return false;
        //add more validations

        return true;
    }

    private boolean checkValidEmail(String email){
        //only @gmail.com && @yahoo.com are valid
        int atIndex = email.indexOf('@');
        String emailDomain = email.substring(atIndex, email.length());
        if(emailDomain.equals("@gmail.com") || emailDomain.equals("@yahoo.com"))return true;
        System.out.println("Invalid email domain!");
        return false;
    }
}
