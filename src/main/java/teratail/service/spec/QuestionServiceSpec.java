package teratail.service.spec;

import teratail.model.response.QuestionEntity;
import teratail.model.response.QuestionListEntity;

public interface QuestionServiceSpec {

  QuestionListEntity findAll();

  QuestionEntity findOne(int questionId);
}
