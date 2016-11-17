package teratail.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

public class ObjectMapperUtil {

  private static ObjectMapper objectMapper = new ObjectMapper()
      .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);

  private ObjectMapperUtil(){

  }

  public static ObjectMapper getInstance() {
    return objectMapper;
  }
}
