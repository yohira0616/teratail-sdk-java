package teratail.model.question;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import teratail.model.user.User;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Question implements Serializable {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("body")
  private String body;

  @JsonProperty("body_str")
  private String bodyStr;

  @JsonProperty("created")
  private String created;

  @JsonProperty("modified")
  private String modified;

  @JsonProperty("count_reply")
  private Integer countReply;

  @JsonProperty("count_clip")
  private Integer countClip;

  @JsonProperty("count_pv")
  private Integer countPv;

  @JsonProperty("is_beginner")
  private Boolean isBeginner;

  @JsonProperty("is_accepted")
  private Boolean isAccepted;

  @JsonProperty("is_presentation")
  private Boolean isPresentation;

  @JsonProperty("tags")
  private List<String> tags;

  @JsonProperty("user")
  private User user;

  @JsonProperty("replies")
  private List<Reply> replies;
}
