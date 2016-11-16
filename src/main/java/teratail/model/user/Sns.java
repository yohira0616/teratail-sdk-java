package teratail.model.user;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Sns implements Serializable {

    private String facebook;

    private String twitter;

    private String google;

    private String github;

    private String hatena;

    private String qiita;
}
