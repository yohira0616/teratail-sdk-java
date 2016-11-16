package teratail.service.spec;

import teratail.model.response.question.QuestionEntity;
import teratail.model.response.question.QuestionListEntity;

public interface QuestionServiceSpec {

  QuestionListEntity findAll();

  QuestionEntity findOne(int questionId);
}
