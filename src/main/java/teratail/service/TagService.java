package teratail.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import teratail.common.ApiClientUtil;
import teratail.common.TeratailHost;
import teratail.model.Pagination;
import teratail.model.response.tag.TagEntity;
import teratail.model.response.tag.TagListEntity;
import teratail.model.response.tag.TagQuestionEntity;
import teratail.service.spec.TagServiceSpec;

import java.io.IOException;
import java.util.List;

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
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE);
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), TagListEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public TagListEntity findAll(Pagination pagination) {
    try {
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + ApiClientUtil.makeRequestParameter(pagination));
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
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + tagName);
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), TagEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public TagQuestionEntity findByTagName(String tagName) {
    try {
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + tagName + "/questions");
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), TagQuestionEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public TagQuestionEntity findByTagName(String tagName, Pagination pagination) {
    try {
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + tagName + "/questions" +
          ApiClientUtil.makeRequestParameter(pagination));
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), TagQuestionEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }
}
