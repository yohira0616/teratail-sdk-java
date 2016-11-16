package teratail.model.tag;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class Tag implements Serializable {

  private String tagName;

  private String explain;

  private Date created;
}
