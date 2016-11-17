package teratail.common;

import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import teratail.model.Pagination;

import java.util.ArrayList;
import java.util.List;

public class ApiClientUtil {

  private ApiClientUtil(){
  }

  public static List<Header> makeRequestHeader(String accessToken) {
    List<Header> header = new ArrayList<>();
    if (!accessToken.equals("")) {
      header.add(new BasicHeader("Authorization", "Bearer " + accessToken));
    }
    return header;
  }

  public static String makeRequestParameter(Pagination pagination) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("?limit=");
    stringBuilder.append(pagination.getLimit());
    stringBuilder.append("&page=");
    stringBuilder.append(pagination.getPage());
    return stringBuilder.toString();
  }

}
