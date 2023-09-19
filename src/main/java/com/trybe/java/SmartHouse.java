package com.trybe.java;

/**
 * Classe.
 **/

public class SmartHouse {

  private boolean lampadaLigada;

  public SmartHouse() {
    lampadaLigada = false;
  }

  public void ligarLampada() {
    lampadaLigada = true;
  }

  public void desligarLampada() {
    lampadaLigada = false;
  }

  public boolean isLampadaLigada() {
    return lampadaLigada;
  }


}

