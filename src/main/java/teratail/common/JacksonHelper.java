package teratail.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

public class JacksonHelper {

    private static ObjectMapper objectMapper=new ObjectMapper();

    public static Map<String,Object> toMap(String json){
        try {
            TypeReference<Map<String, Object>> typeRef = new TypeReference<Map<String, Object>>() {
            };
            return objectMapper.readValue(json, typeRef);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
