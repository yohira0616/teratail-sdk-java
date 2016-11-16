package teratail.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import teratail.TerarailClient;
import teratail.common.JacksonHelper;
import teratail.common.ResultEntityParser;
import teratail.common.TeratailHost;
import teratail.model.Meta;
import teratail.model.question.Question;
import teratail.service.spec.QuestionServiceSpec;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QuestionService implements QuestionServiceSpec {

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
  public List<Question> findAll() {
    return null;
  }

  @Override
  public Question findOne(int questionId) {
    return null;
  }
}
