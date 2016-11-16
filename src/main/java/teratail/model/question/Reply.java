package teratail.model.question;

import lombok.Data;
import teratail.model.user.User;

import java.util.Date;

@Data
public class Reply {

    private String body;

    private String bodyStr;

    private Date created;

    private Date modified;

    private boolean isBestAnswer;

    private User user;
}
