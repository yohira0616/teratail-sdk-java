package teratail.model.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Badge implements Serializable {

  @JsonProperty("level")
  private Integer level;
  @JsonProperty("aquired_date")
  private String aquiredDate;
}
