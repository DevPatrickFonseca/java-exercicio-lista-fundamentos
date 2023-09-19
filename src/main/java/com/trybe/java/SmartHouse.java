package com.trybe.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe SmartHouse.
 */

public class SmartHouse {

  private boolean lampadaLigada;
  private Residente residente;
  private Map<String, String> estadosBrasileiros;

  /**
   * Construtor da classe SmartHouse.
   */

  public SmartHouse() {
    lampadaLigada = false;
  }

  /**
   * Getter's e Setter's Métodos `ligarLampada` e `desligarLampada`.
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
   * Getter's e Setter's Métodos `Residente`.
   */

  public Residente getResidente() {
    return residente;
  }

  public void setResidente(Residente residente) {
    this.residente = residente;
  }

  /**
   * Método `conectarInternet`.
   */

  public boolean conectarInternet() {
    for (int i = 0; i < 3; i++) {
      double randomValue = Math.random();

      if (randomValue < 0.5) {
        return true;
      }
    }

    return false;
  }

  /**
   * Métodos `estadosBrasileiros`.
   */

  public String mostraNomeEstado(String sigla) {
    Map<String, String> estadosBrasileiros = new HashMap<>();
    estadosBrasileiros.put("PE", "Pernambuco");
    estadosBrasileiros.put("SC", "Santa Catarina");
    estadosBrasileiros.put("AM", "Amazonas");

    return estadosBrasileiros.get(sigla);
  }
}
