package com.mladen.cikara.jacoco;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mladen
 *
 */
class MathServiceTest {

  /**
   *
   */
  private MathService mathService;

  /**
   * setup for tests.
   */
  @BeforeEach
  private void setup() {
    mathService = new MathService();
  }

  /**
   *
   */
  @Test
  void shoudAddTwoNumbers() {
    assertThat(mathService.add(2, 2)).isEqualTo(2 + 2);
  }

}
