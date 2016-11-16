package teratail.model.user;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Ranking implements Serializable {

    private int rank;

    private int score;
}
