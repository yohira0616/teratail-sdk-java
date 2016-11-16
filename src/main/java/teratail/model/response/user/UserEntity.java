package teratail.model.response.user;

import lombok.Data;
import teratail.model.Meta;
import teratail.model.user.User;

import java.io.Serializable;

@Data
public class UserEntity implements Serializable {

  private Meta meta;

  private User user;
}
