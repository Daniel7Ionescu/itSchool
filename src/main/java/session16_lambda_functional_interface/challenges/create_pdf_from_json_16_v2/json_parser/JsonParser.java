package session16_lambda_functional_interface.challenges.create_pdf_from_json_16_v2.json_parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonParser {

    private static ObjectMapper objectMapper = createObjectMapper();

    //map data to object properties
    public static <T> T objFromJson(JsonNode node, Class<T> tClass) throws JsonProcessingException {
        return objectMapper.treeToValue(node, tClass);
    }

    //parse json source and return a json node
    public static JsonNode parseStringSource(String source) throws JsonProcessingException {
       return objectMapper.readTree(source);
    }

    private static ObjectMapper createObjectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        //configuration settings
        //register module so mapper can work with LocalDateTime from time
        objectMapper.registerModule(new JavaTimeModule());
        //don't fail if the json has a property that the object doesn't have
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper;
    }
}
