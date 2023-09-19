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
    SmartHouse casa = new SmartHouse();

    double h = residente.calculaImc();
    boolean conectado = casa.conectarInternet();
    String nomeEstado = casa.mostraNomeEstado("PE");

    System.out.println(
        "Nome: " + residente.getNome() + "\nIdade: " + residente.getIdade() + "\nPeso: "
            + residente.getPeso()
            + "\nAltura: " + residente.getAltura()
            + "\n"
            + "\nIMC: " + h
            + "\n"
            + "\nConectado: " + (conectado ?
            "Conectado à Internet" : "Falha na conexão à Internet")
            + "\n"
            + "\nNome do Estado: " + nomeEstado
    );
  }
}
