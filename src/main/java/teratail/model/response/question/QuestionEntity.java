package teratail.model.response.question;

import lombok.Data;
import teratail.model.Meta;
import teratail.model.question.Question;

import java.io.Serializable;

@Data
public class QuestionEntity implements Serializable {

  private Meta meta;

  private Question question;
}
