package com.mladen.cikara.jacoco;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppIT {

  private App app;

  /**
   *
   */
  @BeforeEach
  private void setup() {
    final MathService mathService = new MathService();
    app = new App(mathService);
  }

  /**
   *
   */
  @Test
  void test() {
    assertThat(app.solve()).isEqualTo(4);
  }

}
