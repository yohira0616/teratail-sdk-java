package teratail.service.spec;

import teratail.model.response.question.QuestionListEntity;
import teratail.model.response.tag.TagListEntity;
import teratail.model.response.user.UserEntity;
import teratail.model.response.user.UserListEntity;

public interface UserServiceSpec {

  UserListEntity findAll();

  UserListEntity findByName(String query);

  UserEntity findOne(String displayName);

  TagListEntity findMyTags(String displayName);

  QuestionListEntity findClippedQuestion(String displayName);

  QuestionListEntity findQuestions(String displayName);

  QuestionListEntity findReplies(String displayName);

  UserListEntity getFollower(String displayName);

  UserListEntity getFollowing(String displayName);
}
