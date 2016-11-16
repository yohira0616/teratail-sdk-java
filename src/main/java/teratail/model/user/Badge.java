package teratail.model.user;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class Badge implements Serializable {

  private int level;
  private Date aquiredDate;
}
