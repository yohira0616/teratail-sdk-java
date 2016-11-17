package teratail.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import teratail.common.TeratailHost;
import teratail.model.response.question.QuestionListEntity;
import teratail.model.response.tag.TagListEntity;
import teratail.model.response.user.UserEntity;
import teratail.model.response.user.UserListEntity;
import teratail.service.spec.UserServiceSpec;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService implements UserServiceSpec {

  private String accessToken = "";

  private static final String API_BASE = "users";

  private ObjectMapper objectMapper = new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);

  public UserService() {

  }

  public UserService(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public UserListEntity findAll() {
    try {
      List<Header> header = makeRequestHeader();
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE);
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), UserListEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public UserListEntity findByName(String query) {
    try {
      List<Header> header = makeRequestHeader();
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/search?q=" + query);
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), UserListEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public UserEntity findOne(String displayName) {
    try {
      List<Header> header = makeRequestHeader();
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName);
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), UserEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public TagListEntity findMyTags(String displayName) {
    try {
      List<Header> header = makeRequestHeader();
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName + "/tags");
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), TagListEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public QuestionListEntity findClippedQuestion(String displayName) {
    try {
      List<Header> header = makeRequestHeader();
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName + "/clips");
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), QuestionListEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public QuestionListEntity findQuestions(String displayName) {
    try {
      List<Header> header = makeRequestHeader();
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName + "/questions");
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), QuestionListEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public QuestionListEntity findReplies(String displayName) {
    try {
      List<Header> header = makeRequestHeader();
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName + "/replies");
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), QuestionListEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public UserListEntity getFollower(String displayName) {
    try {
      List<Header> header = makeRequestHeader();
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName + "/followers");
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), UserListEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public UserListEntity getFollowing(String displayName) {
    try {
      List<Header> header = makeRequestHeader();
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName + "/followings");
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), UserListEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  private List<Header> makeRequestHeader(){
    List<Header> header = new ArrayList<>();
    if (!accessToken.equals("")) {
      header.add(new BasicHeader("Authorization", "Bearer " + accessToken));
    }
    return header;
  }
}
