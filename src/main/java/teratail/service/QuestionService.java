package teratail.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import teratail.common.ResultEntityParser;
import teratail.common.TeratailHost;
import teratail.model.Meta;
import teratail.model.response.QuestionEntity;
import teratail.model.response.QuestionListEntity;
import teratail.service.spec.QuestionServiceSpec;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class QuestionService implements QuestionServiceSpec {

  private String accessToken = "";

  private ObjectMapper objectMapper = new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);

  private static final String API_BASE = "questions";

  public QuestionService() {

  }

  public QuestionService(String accessToken) {
    this.accessToken = accessToken;
  }

  public static void main(String... args) {

    try {

      List<Header> headers = new ArrayList<Header>();
      HttpClient httpClient = HttpClientBuilder.create()
          .setDefaultHeaders(headers).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + "questions/55430");
      HttpResponse response = httpClient.execute(httpGet);
      //String body = EntityUtils.toString(response.getEntity(), "UTF-8");
      //System.out.println(body);

      Meta meta = ResultEntityParser.parseMeta(response.getEntity());
      System.out.println(meta);


    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
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
