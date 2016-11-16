package teratail.service;

import teratail.model.question.Question;
import teratail.model.tag.Tag;
import teratail.model.user.User;
import teratail.service.spec.UserServiceSpec;

import java.util.List;

public class UserService implements UserServiceSpec {

  private String accessToken = "";

  public UserService() {

  }

  public UserService(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public List<User> findAll() {
    return null;
  }

  @Override
  public List<User> findByName(String query) {
    return null;
  }

  @Override
  public User findOne(String displayName) {
    return null;
  }

  @Override
  public List<Tag> findMyTags(String displayName) {
    return null;
  }

  @Override
  public List<Question> findClippedQuestion(String displayName) {
    return null;
  }

  @Override
  public List<Question> findAnswered(String displayName) {
    return null;
  }

  @Override
  public List<Question> findAsked(String displayName) {
    return null;
  }

  @Override
  public List<User> getFollower(String displayName) {
    return null;
  }

  @Override
  public List<User> getFollowee(String displayName) {
    return null;
  }
}
