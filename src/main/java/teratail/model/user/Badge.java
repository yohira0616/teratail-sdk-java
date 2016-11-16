package teratail.model.user;

import lombok.Data;

import java.util.Date;

@Data
public class Badge {

    private int level;
    private Date aquiredDate;
}
