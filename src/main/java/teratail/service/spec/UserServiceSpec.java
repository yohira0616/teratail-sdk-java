package teratail.service.spec;

import teratail.model.question.Question;
import teratail.model.tag.Tag;
import teratail.model.user.User;

import java.util.List;

public interface UserServiceSpec {

  List<User> findAll();

  List<User> findByName(String query);

  User findOne(String displayName);

  List<Tag> findMyTags(String displayName);

  List<Question> findClippedQuestion(String displayName);

  List<Question> findAnswered(String displayName);

  List<Question> findAsked(String displayName);

  List<User> getFollower(String displayName);

  List<User> getFollowee(String displayName);
}
