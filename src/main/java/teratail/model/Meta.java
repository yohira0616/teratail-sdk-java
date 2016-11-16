package teratail.model;

import lombok.Data;

/**
 * APIをコールした時に取得されるメタデータ
 */
@Data
public class Meta {
    private String message;
    private int totalPage;
    private int page;
    private int limit;
    private int hitNum;
}
