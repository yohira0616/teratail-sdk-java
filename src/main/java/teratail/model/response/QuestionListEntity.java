package teratail.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import teratail.model.Meta;
import teratail.model.question.Question;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionListEntity implements Serializable {

  private Meta meta;

  private List<Question> questions;
}
