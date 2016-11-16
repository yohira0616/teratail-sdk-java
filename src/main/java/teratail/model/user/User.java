package teratail.model.user;

import lombok.Data;
import lombok.ToString;
import teratail.model.tag.Tag;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@ToString
public class User implements Serializable {

    private String displayName;

    private Date created;

    private Date modified;

    private String photo;

    private String department;

    private String prefecture;

    private String selfIntro;

    private String blog;

    private int score;

    private ScoreRanking scoreRanking;

    private List<Tag> tags;

    private Sns sns;

    private List<Badge> badges;
}
