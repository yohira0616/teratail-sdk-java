package teratail.model.tag;

import lombok.Data;

import java.util.Date;

@Data
public class Tag {

    private String tagName;

    private String explain;

    private Date created;
}
