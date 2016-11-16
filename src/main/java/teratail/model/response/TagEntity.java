package teratail.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import teratail.model.Meta;
import teratail.model.tag.Tag;

import java.io.Serializable;

@Data
public class TagEntity implements Serializable {
  @JsonProperty("meta")
  private Meta meta;

  @JsonProperty("tag")
  private Tag tag;
}
