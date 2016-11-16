package teratail.model.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sns implements Serializable {

  @JsonProperty("facebook")
  private String facebook;

  @JsonProperty("twitter")
  private String twitter;

  @JsonProperty("google")
  private String google;

  @JsonProperty("github")
  private String github;

  @JsonProperty("hatena")
  private String hatena;

  @JsonProperty("qiita")
  private String qiita;
}
