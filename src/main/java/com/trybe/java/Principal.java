package com.trybe.java;

/**
 * Classe principal para testar a classe Residente.
 */

public class Principal {

  /**
   * Método principal.
   *
   * @param args Argumentos passados para o programa.
   */

  public static void main(String[] args) {
    Residente residente = new Residente("João", 22, 72, 1.75);

    double h = residente.calculaImc();

    System.out.println(
        "Nome: " + residente.getNome() + "\nIdade: " + residente.getIdade() + "\nPeso: "
            + residente.getPeso()
            + "\nAltura: " + residente.getAltura()
            + "\nIMC: " + h);
  }
}
