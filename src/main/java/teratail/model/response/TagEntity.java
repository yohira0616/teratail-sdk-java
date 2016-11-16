package teratail.model.response;

import lombok.Data;
import teratail.model.Meta;
import teratail.model.tag.Tag;

@Data
public class TagEntity {
  private Meta meta;

  private Tag tag;
}
