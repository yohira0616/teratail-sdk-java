package teratail.model.response;

import lombok.Data;
import teratail.model.Meta;
import teratail.model.user.User;

import java.util.List;

@Data
public class UserListEntity {

  private Meta meta;

  private List<User> users;

}
