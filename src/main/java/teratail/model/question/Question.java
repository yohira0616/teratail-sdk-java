package teratail.model.question;

import lombok.Data;
import lombok.ToString;
import teratail.model.tag.Tag;
import teratail.model.user.User;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@ToString
public class Question implements Serializable{

    private int id;

    private String title;

    private String body;

    private String bodyStr;

    private Date created;

    private Date modifired;

    private int countReply;

    private int countClip;

    private int countPv;

    private boolean isBiginner;

    private boolean isAccepted;

    private boolean isPresentation;

    private List<Tag> tags;

    private User user;

    private List<Reply> replies;
}
