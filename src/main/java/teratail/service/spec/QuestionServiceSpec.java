package teratail.service.spec;

import teratail.model.question.Question;

import java.util.List;

public interface QuestionServiceSpec {

  List<Question> findAll();

  Question findOne(int questionId);
}
