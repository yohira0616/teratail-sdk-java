package teratail.model;

import lombok.Data;

@Data
public class Pagination {

  private int page = 20;

  private int limit = 1;

}
