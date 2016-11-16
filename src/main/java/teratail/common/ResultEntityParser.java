package teratail.common;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import teratail.model.Meta;

import java.io.IOException;

public class ResultEntityParser {

  private static ObjectMapper objectMapper = new ObjectMapper();

  //TODO IOExceptionを本当に投げつけるべきか
  public static Meta parseMeta(HttpEntity entity) throws IOException {
    JsonNode jsonNode = objectMapper.readTree(entity.getContent());
    JsonNode metaNode = jsonNode.path("meta");
    return objectMapper.readValue(metaNode.toString(), Meta.class);

  }
}
