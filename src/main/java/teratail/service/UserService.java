package teratail.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import teratail.common.ApiClientUtil;
import teratail.common.ObjectMapperUtil;
import teratail.common.TeratailHost;
import teratail.model.request.Pagination;
import teratail.model.response.question.QuestionListEntity;
import teratail.model.response.tag.TagListEntity;
import teratail.model.response.user.UserEntity;
import teratail.model.response.user.UserListEntity;
import teratail.service.spec.UserServiceSpec;

import java.io.IOException;
import java.util.List;

public class UserService implements UserServiceSpec {

  private String accessToken = "";

  private static final String API_BASE = "users";

  private ObjectMapper objectMapper = ObjectMapperUtil.getInstance();

  public UserService() {

  }

  public UserService(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public UserListEntity findAll() {
    try {
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
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
  public UserListEntity findAll(Pagination pagination) {
    try {
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + ApiClientUtil.makeRequestParameter(pagination));
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
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
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
  public UserListEntity findByName(String query, Pagination pagination) {
    try {
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/search" +
          ApiClientUtil.makeRequestParameter(pagination) + "&q=" + query);
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
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
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
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
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
  public TagListEntity findMyTags(String displayName, Pagination pagination) {
    try {
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName + "/tags"
          + ApiClientUtil.makeRequestParameter(pagination));
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
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
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
  public QuestionListEntity findClippedQuestion(String displayName, Pagination pagination) {
    try {
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName + "/clips"
          + ApiClientUtil.makeRequestParameter(pagination));
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
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
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
  public QuestionListEntity findQuestions(String displayName, Pagination pagination) {
    try {
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName + "/questions"
          + ApiClientUtil.makeRequestParameter(pagination));
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
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
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
  public QuestionListEntity findReplies(String displayName, Pagination pagination) {
    try {
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName + "/replies"
          + ApiClientUtil.makeRequestParameter(pagination));
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
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
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
  public UserListEntity getFollower(String displayName, Pagination pagination) {
    try {
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName + "/followers" + ApiClientUtil.makeRequestParameter(pagination));
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
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName + "/followings");
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), UserListEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  @Override
  public UserListEntity getFollowing(String displayName, Pagination pagination) {
    try {
      List<Header> header = ApiClientUtil.makeRequestHeader(accessToken);
      HttpClient client = HttpClientBuilder.create().setDefaultHeaders(header).build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + API_BASE + "/" + displayName + "/followings"
          + ApiClientUtil.makeRequestParameter(pagination));
      HttpResponse response = client.execute(httpGet);
      return objectMapper.readValue(response.getEntity().getContent(), UserListEntity.class);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }
}
