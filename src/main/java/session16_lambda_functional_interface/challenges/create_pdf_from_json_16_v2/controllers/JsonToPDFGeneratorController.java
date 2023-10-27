package session16_lambda_functional_interface.challenges.create_pdf_from_json_16_v2.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import session16_lambda_functional_interface.challenges.create_pdf_from_json_16_v2.json_parser.JsonParser;
import session16_lambda_functional_interface.challenges.create_pdf_from_json_16_v2.models.Resume;
import session16_lambda_functional_interface.challenges.create_pdf_from_json_16_v2.services.JsonToPDFGeneratorService;

@RestController
public class JsonToPDFGeneratorController {

    @Autowired
    JsonToPDFGeneratorService jsonService;

    Resume resume;

    @GetMapping("/checkResume")
    String checkResume(){
        return "Here there should be validations";
    }

    @GetMapping("/jsonToObj")
    @ResponseBody
    String makePDF(@RequestBody String incomingJson ){
       //map the data on the object
        try {
            JsonNode jsonNode = JsonParser.parseStringSource(incomingJson);
            resume = JsonParser.objFromJson(jsonNode, Resume.class);

            return "Data successfully sent!";
        } catch (JsonProcessingException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
