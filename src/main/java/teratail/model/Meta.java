package teratail.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * APIをコールした時に取得されるメタデータ
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta implements Serializable {
  @JsonProperty("message")
  private String message;
  @JsonProperty("total_page")
  private Integer totalPage;
  @JsonProperty("page")
  private Integer page;
  @JsonProperty("limit")
  private Integer limit;
  @JsonProperty("hit_num")
  private Integer hitNum;
}
