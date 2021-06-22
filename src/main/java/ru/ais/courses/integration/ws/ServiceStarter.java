package ru.ais.courses.integration.ws;

import javax.xml.ws.Endpoint;

public class ServiceStarter {
  public static void main(String... __) {
    String url = "http://localhost:1212/hello";
    Endpoint.publish(url, new Hello());
    System.out.printf("Service started @ %s%n", url);
  }
}
