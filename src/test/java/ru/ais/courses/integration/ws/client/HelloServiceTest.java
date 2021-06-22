package ru.ais.courses.integration.ws.client;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloServiceTest {

  @Test
  @SneakyThrows
  @DisplayName("WebService works correctly")
  void webServiceWorksCorrectlyTest() {
    assertThat(new HelloService().getHelloPort().sayHello("Henry")).isNotNull()
        .isEqualTo("Hello, Henry!");
  }
}
