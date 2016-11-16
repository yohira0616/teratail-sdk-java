package teratail.model.response;

import lombok.Data;
import teratail.model.Meta;
import teratail.model.question.Question;

@Data
public class QuestionEntity {

  private Meta meta;

  private Question question;
}
