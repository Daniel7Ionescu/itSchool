package test.session16_tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
//import org.junit.jupiter.api.Test;
import session16_lambda_functional_interface.challenges.create_pdf_from_json_16_v2.json_parser.JsonParser;
import session16_lambda_functional_interface.challenges.create_pdf_from_json_16_v2.models.Resume;

//import static org.junit.jupiter.api.Assertions.*;

class JsonParserTest {

    String simpleJsonSource = "{\"name\" : \"Kenny\"}";
    String smallObjJsonSource = "{\n" +
            "  \"title\" : \"Cool resume\",\n" +
            "  \"personalDetails\" : {\n" +
            "    \"name\" : \"John Doe\",\n" +
            "    \"adress\" : \"123 Main St, Hometown, USA\",\n" +
            "    \"phoneNumber\" : 123456789,\n" +
            "    \"email\" : \"john.doe@gmail.com\"\n" +
            "  }" + "}";

//    @Test
//    void shouldMapSomePropsToObject() throws JsonProcessingException {
//        JsonNode jsonNode = JsonParser.parseStringSource(smallObjJsonSource);
//        Resume resume = JsonParser.objFromJson(jsonNode, Resume.class);
//
//        System.out.println(resume.getTitle());
//        System.out.println(resume.getPersonalDetails());
//    }
//
//    @Test
//    void parse() throws JsonProcessingException {
//        JsonNode jsonNode = JsonParser.parseStringSource(simpleJsonSource);
//        assertEquals("Kenny", jsonNode.get("name").asText());
//    }
}