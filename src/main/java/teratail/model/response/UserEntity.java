package teratail.model.response;

import lombok.Data;
import teratail.model.Meta;
import teratail.model.user.User;

@Data
public class UserEntity {

  private Meta meta;

  private User user;
}
