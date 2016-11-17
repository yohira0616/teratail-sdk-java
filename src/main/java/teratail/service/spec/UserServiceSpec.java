package teratail.service.spec;

import teratail.model.request.Pagination;
import teratail.model.response.question.QuestionListEntity;
import teratail.model.response.tag.TagListEntity;
import teratail.model.response.user.UserEntity;
import teratail.model.response.user.UserListEntity;

public interface UserServiceSpec {

  UserListEntity findAll();

  UserListEntity findAll(Pagination pagination);

  UserListEntity findByName(String query);

  UserListEntity findByName(String query, Pagination pagination);

  UserEntity findOne(String displayName);

  TagListEntity findMyTags(String displayName);

  TagListEntity findMyTags(String displayName, Pagination pagination);

  QuestionListEntity findClippedQuestion(String displayName);

  QuestionListEntity findClippedQuestion(String displayName, Pagination pagination);

  QuestionListEntity findQuestions(String displayName);

  QuestionListEntity findQuestions(String displayName, Pagination pagination);

  QuestionListEntity findReplies(String displayName);

  QuestionListEntity findReplies(String displayName, Pagination pagination);

  UserListEntity getFollower(String displayName);

  UserListEntity getFollower(String displayName, Pagination pagination);

  UserListEntity getFollowing(String displayName);

  UserListEntity getFollowing(String displayName, Pagination pagination);
}
