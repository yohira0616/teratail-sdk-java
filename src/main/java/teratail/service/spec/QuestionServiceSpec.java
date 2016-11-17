package teratail.service.spec;

import teratail.model.Pagination;
import teratail.model.response.question.QuestionEntity;
import teratail.model.response.question.QuestionListEntity;

public interface QuestionServiceSpec {

  QuestionListEntity findAll();

  QuestionListEntity findAll(Pagination pagination);

  QuestionEntity findOne(int questionId);
}
