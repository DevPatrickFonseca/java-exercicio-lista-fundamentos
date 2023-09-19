package com.trybe.java;

/**
 * Classe SmartHouse.
 */

public class SmartHouse {

  private boolean lampadaLigada;
  private Residente residente;

  /**
   * Construtor da classe SmartHouse.
   */

  public SmartHouse() {
    lampadaLigada = false;
  }

  /**
   * Getter's e Setter's
   * Métodos `ligarLampada` e `desligarLampada`.
   */
  public void ligarLampada() {
    lampadaLigada = true;
  }

  public void desligarLampada() {
    lampadaLigada = false;
  }

  public boolean isLampadaLigada() {
    return lampadaLigada;
  }

  /**
   * Getter's e Setter's
   * Métodos `Residente`.
   */

  public Residente getResidente() {
    return residente;
  }

  public void setResidente(Residente residente) {
    this.residente = residente;
  }
}
