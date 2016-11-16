package teratail.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * APIをコールした時に取得されるメタデータ
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta implements Serializable {
    private String message;
    private int totalPage;
    private int page;
    private int limit;
    private int hitNum;
}
