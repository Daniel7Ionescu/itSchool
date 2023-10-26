package session15_equals_hashcode.challenges.xml_to_json_conversion;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class XmlToJsonApp {

    public static void main(String[] args) throws IOException {


        //--file path stuff--
        String filename="bookstore.xml";
        Path pathToFile = Paths.get(filename);
        System.out.println(pathToFile.toAbsolutePath());
        String bookstorePath = "src/session15_equals_hashcode/challenges/xml_to_json_conversion/bookstore.xml";

        //--Works but kinda sucks--
        //to redo
//        String myXml = Files.readString(Paths.get(bookstorePath));
//        JSONObject jsonObject = XML.toJSONObject(myXml);
//        String jsonAsString = jsonObject.toString(2);
//        System.out.print(jsonAsString);

        //below be dragons

        // Create XML mapper
//        XmlMapper xmlMapper = new XmlMapper();
//
//        // Convert XML to JSON
//        ObjectMapper jsonMapper = new ObjectMapper();
//        jsonMapper.enable(SerializationFeature.INDENT_OUTPUT);
//        Object json = jsonMapper.readValue(xmlMapper.readValue("some.xml", Object.class).toString(), Object.class);
//
//        // Print JSON output
//        System.out.println(jsonMapper.writeValueAsString(json));


//        XmlMapper xmlMapper = new XmlMapper();
//        Vehicle vehicle = xmlMapper.readValue(testPath, Vehicle.class);
//        ObjectMapper mapper = new ObjectMapper();
//        String xmlAsJson = mapper.writeValueAsString(vehicle);
//        System.out.print(xmlAsJson);


    }


}
