package ru.ais.courses.integration.ws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Hello {

  @SuppressWarnings("unused")
  public String sayHello(String name) {
    return "Hello, %s!".formatted(name);
  }
}
