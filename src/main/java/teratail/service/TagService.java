package teratail.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import teratail.common.TeratailHost;
import teratail.model.response.TagEntity;
import teratail.model.response.TagListEntity;
import teratail.service.spec.TagServiceSpec;

import java.io.IOException;

public class TagService implements TagServiceSpec {
  private String accessToken = "";

  private ObjectMapper objectMapper = new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);

  private static final String API_BASE = "tags";

  public TagService() {

  }

  public TagService(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public TagListEntity findAll() {
    try {
      HttpClient client = HttpClientBuilder.create().build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE);
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), TagListEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public TagEntity findOne(String tagName) {
    try {
      HttpClient client = HttpClientBuilder.create().build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + tagName);
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), TagEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public TagListEntity findByTagName(String tagName) {
    return null;
  }
}
