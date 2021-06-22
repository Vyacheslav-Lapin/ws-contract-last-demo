package ru.ais.courses.integration.ws;

import static java.lang.System.out;

import javax.xml.ws.Endpoint;
import lombok.val;

public class ServiceStarter {
  public static void main(String... __) {
    val url = "http://localhost:1212/hello";
    Endpoint.publish(url, new Hello());
    out.printf("Service started @ %s%n", url);
  }
}
