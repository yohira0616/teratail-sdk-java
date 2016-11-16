package teratail.model.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScoreRanking implements Serializable {

  @JsonProperty("total")
  private Ranking total;

  @JsonProperty("weekly")
  private Ranking weekly;
}
