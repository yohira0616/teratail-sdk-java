package teratail.service.spec;

import teratail.model.response.QuestionListEntity;
import teratail.model.response.TagListEntity;
import teratail.model.response.UserEntity;
import teratail.model.response.UserListEntity;

public interface UserServiceSpec {

  UserListEntity findAll();

  UserListEntity findByName(String query);

  UserEntity findOne(String displayName);

  TagListEntity findMyTags(String displayName);

  QuestionListEntity findClippedQuestion(String displayName);

  QuestionListEntity findAnswered(String displayName);

  QuestionListEntity findAsked(String displayName);

  UserListEntity getFollower(String displayName);

  UserListEntity getFollowee(String displayName);
}
