package teratail.model.user;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class ScoreRanking implements Serializable {

    private Ranking total;

    private Ranking weekly;
}
