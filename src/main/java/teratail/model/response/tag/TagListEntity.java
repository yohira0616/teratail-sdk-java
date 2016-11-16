package teratail.model.response.tag;

import lombok.Data;
import teratail.model.Meta;
import teratail.model.tag.Tag;

import java.io.Serializable;
import java.util.List;

@Data
public class TagListEntity implements Serializable {
  private Meta meta;

  private List<Tag> tags;
}
