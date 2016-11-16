package teratail.common;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class ApiClient {

  public HttpResponse get(String path) {
    try {
      HttpClient client = HttpClientBuilder.create().build();
      HttpGet httpGet = new HttpGet(TeratailHost.HOST + path);
      HttpResponse response = client.execute(httpGet);
      return response;
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }

  }

  public HttpResponse get(String path, String accessToken) {
    //TODO
    return null;
  }
}
