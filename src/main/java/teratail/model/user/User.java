package teratail.model.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import teratail.model.tag.Tag;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("created")
  private String created;

  @JsonProperty("modified")
  private String modified;

  @JsonProperty("photo")
  private String photo;

  @JsonProperty("department")
  private String department;

  @JsonProperty("prefecture")
  private String prefecture;

  @JsonProperty("self_intro")
  private String selfIntro;

  @JsonProperty("blog")
  private String blog;

  @JsonProperty("score")
  private Integer score;

  @JsonProperty("score_ranking")
  private ScoreRanking scoreRanking;

  @JsonProperty("tags")
  private List<Tag> tags;

  @JsonProperty("sns")
  private Sns sns;

  @JsonProperty("badges")
  private List<Badge> badges;
}
