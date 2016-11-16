package teratail.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import teratail.model.response.QuestionListEntity;
import teratail.model.response.TagListEntity;
import teratail.model.response.UserEntity;
import teratail.model.response.UserListEntity;
import teratail.service.spec.UserServiceSpec;

public class UserService implements UserServiceSpec {

  private String accessToken = "";

  private static final String API_BASE = "users";

  private ObjectMapper objectMapper = new ObjectMapper();

  public UserService() {

  }

  public UserService(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public UserListEntity findAll() {
    return null;
  }

  @Override
  public UserListEntity findByName(String query) {
    return null;
  }

  @Override
  public UserEntity findOne(String displayName) {
    return null;
  }

  @Override
  public TagListEntity findMyTags(String displayName) {
    return null;
  }

  @Override
  public QuestionListEntity findClippedQuestion(String displayName) {
    return null;
  }

  @Override
  public QuestionListEntity findAnswered(String displayName) {
    return null;
  }

  @Override
  public QuestionListEntity findAsked(String displayName) {
    return null;
  }

  @Override
  public UserListEntity getFollower(String displayName) {
    return null;
  }

  @Override
  public UserListEntity getFollowee(String displayName) {
    return null;
  }
}
