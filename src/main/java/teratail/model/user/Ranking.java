package teratail.model.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ranking implements Serializable {

  @JsonProperty("rank")
  private Integer rank;

  @JsonProperty("score")
  private Integer score;
}
