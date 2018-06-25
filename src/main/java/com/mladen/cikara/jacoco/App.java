package com.mladen.cikara.jacoco;

/**
 *
 * @author mladen
 *
 */
public class App {

  /**
   *
   */
  private final MathService mathService;

  /**
   *
   * @param mathService
   */
  public App(MathService mathService) {
    this.mathService = mathService;
  }

  /**
   *
   * @return
   */
  public Integer solve() {
    return mathService.add(2, 2);
  }
}
