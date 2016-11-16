package teratail.model.response;

import lombok.Data;
import teratail.model.Meta;
import teratail.model.question.Question;

import java.util.List;

@Data
public class QuestionListEntity {

  private Meta meta;

  private List<Question> questions;
}
