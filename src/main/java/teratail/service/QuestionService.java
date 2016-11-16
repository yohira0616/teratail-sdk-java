package teratail.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import teratail.common.TeratailHost;
import teratail.model.response.question.QuestionEntity;
import teratail.model.response.question.QuestionListEntity;
import teratail.service.spec.QuestionServiceSpec;

import java.io.IOException;

public class QuestionService implements QuestionServiceSpec {

  private String accessToken = "";

  private ObjectMapper objectMapper = new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);

  private static final String API_BASE = "questions";

  public QuestionService() {

  }

  public QuestionService(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public QuestionListEntity findAll() {
    try {
      HttpClient client = HttpClientBuilder.create().build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE);
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), QuestionListEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public QuestionEntity findOne(int questionId) {
    try {
      HttpClient client = HttpClientBuilder.create().build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + questionId);
      HttpResponse response = client.execute(httpGet);

      return objectMapper.readValue(response.getEntity().getContent(), QuestionEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }
}
