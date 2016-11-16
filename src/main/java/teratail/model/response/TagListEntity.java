package teratail.model.response;

import lombok.Data;
import teratail.model.Meta;
import teratail.model.tag.Tag;

import java.util.List;

@Data
public class TagListEntity {
  private Meta meta;

  private List<Tag> tags;
}
