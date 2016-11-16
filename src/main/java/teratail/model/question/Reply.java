package teratail.model.question;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import teratail.model.user.User;

import java.io.Serializable;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Reply implements Serializable {

  @JsonProperty("body")
  private String body;

  @JsonProperty("body_str")
  private String bodyStr;

  @JsonProperty("created")
  private String created;

  @JsonProperty("modified")
  private String modified;

  @JsonProperty("is_best_answer")
  private Boolean isBestAnswer;

  @JsonProperty("user")
  private User user;
}
