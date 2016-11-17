package teratail;

import teratail.service.QuestionService;
import teratail.service.TagService;
import teratail.service.UserService;
import teratail.service.spec.QuestionServiceSpec;
import teratail.service.spec.TagServiceSpec;
import teratail.service.spec.UserServiceSpec;

public class Teratail {

  private QuestionServiceSpec questionService = new QuestionService();
  private TagServiceSpec tagService = new TagService();
  private UserServiceSpec userService = new UserService();
  private String accessToken;

  public Teratail() {
    questionService = new QuestionService();
    tagService = new TagService();
    userService = new UserService();
  }

  public Teratail(String accessToken) {
    this.accessToken = accessToken;
    questionService = new QuestionService(accessToken);
    tagService = new TagService(accessToken);
    userService = new UserService(accessToken);
  }

  public UserServiceSpec user() {
    return userService;
  }

  public QuestionServiceSpec question() {
    return questionService;
  }

  public TagServiceSpec tag() {
    return tagService;
  }

}
