package teratail.model.response;

import lombok.Data;
import teratail.model.Meta;
import teratail.model.user.User;

import java.io.Serializable;
import java.util.List;

@Data
public class UserListEntity implements Serializable {

  private Meta meta;

  private List<User> users;

}
