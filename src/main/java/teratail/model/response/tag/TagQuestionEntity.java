package teratail.model.response.tag;

import lombok.Data;
import teratail.model.Meta;
import teratail.model.question.Question;
import teratail.model.tag.Tag;

import java.util.List;

@Data
public class TagQuestionEntity {

  private Meta meta;

  private Tag tag;

  private List<Question> questions;
}
