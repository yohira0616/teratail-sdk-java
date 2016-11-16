package teratail.model.tag;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tag implements Serializable {

  @JsonProperty("tag_name")
  private String tagName;

  @JsonProperty("explain")
  private String explain;

  @JsonProperty("created")
  private String created;
}
