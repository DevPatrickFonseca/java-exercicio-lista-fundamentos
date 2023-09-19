package com.trybe.java;

/**
 * Classe Residente.
 */

public class Residente {

  private String nome;
  private int idade;
  private double peso;
  private double altura;

  /**
   * Construtor da classe Residente.
   *
   * @param nome   Nome do residente.
   * @param idade  Idade do residente.
   * @param peso   Peso do residente.
   * @param altura Altura do residente.
   */
  public Residente(
      String nome,
      int idade,
      double peso,
      double altura
  ) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  /**
   * Construtor da classe Residente.
   */
  public Residente() {
  }

  /**
   * Getter's e Setter's Métodos `nome`, `idade`, `peso` e `altura`.
   */
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  /**
   * Método `imc`. Calcula o IMC do residente.
   *
   * @return IMC do residente.
   */

  public double calculaImc() {
    return this.peso / (this.altura * this.altura);
  }
}
