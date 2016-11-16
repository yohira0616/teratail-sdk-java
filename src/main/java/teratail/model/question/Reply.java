package teratail.model.question;

import lombok.Data;
import lombok.ToString;
import teratail.model.user.User;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class Reply implements Serializable {

    private String body;

    private String bodyStr;

    private Date created;

    private Date modified;

    private boolean isBestAnswer;

    private User user;
}
