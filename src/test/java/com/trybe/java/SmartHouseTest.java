package com.trybe.java;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.*;


public class SmartHouseTest {

  private SmartHouse smartHouse;
  private Residente residente;
  private Class<?> smartHouseClass;
  private Class<?> residentClass;

  @BeforeEach
  public void setUp() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    this.smartHouseClass = Class.forName("com.trybe.java.SmartHouse");
    Constructor<?> smartHouseConstructor = smartHouseClass.getConstructor();
    this.smartHouse = (SmartHouse) smartHouseConstructor.newInstance();

    this.residentClass = Class.forName("com.trybe.java.Residente");
    Constructor<?> constructor = residentClass.getConstructor(String.class, int.class, double.class, double.class);
    this.residente = (Residente) constructor.newInstance("João", 30, 70.0, 1.75);
  }

  @Test
  @DisplayName("1 - Controle da Lâmpada")
  public void testLampada() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Method lampadaLigada = smartHouseClass.getDeclaredMethod("isLampadaLigada");
    assertNotNull(lampadaLigada);
    smartHouseClass.getDeclaredMethod("ligarLampada").invoke(smartHouse);
    boolean islampadaLigada =(boolean)  smartHouseClass.getDeclaredMethod("isLampadaLigada").invoke(smartHouse);

    assertTrue(islampadaLigada);
    smartHouseClass.getMethod("desligarLampada").invoke(smartHouse);
    islampadaLigada = smartHouseClass.getMethod("isLampadaLigada").invoke(smartHouse).equals(true);
    assertFalse(islampadaLigada);
  }

  @Test
  @DisplayName("2 - Monitoramento do Residente")
  public void testResidente() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    smartHouseClass.getMethod("setResidente", residentClass).invoke(this.smartHouse, residente);
    String nome = (String) residentClass.getMethod("getNome").invoke(residente);
    assertEquals("João", nome);
    int idade = (int) residentClass.getDeclaredMethod("getIdade").invoke(residente);
    assertEquals("João", nome);
    assertEquals(30, idade);
  }

  @Test
  @DisplayName("3 - Cálculo do IMC")
  public void testImc() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    smartHouseClass.getDeclaredMethod("setResidente", residentClass).invoke(this.smartHouse, residente);
    Residente otherResidente = (Residente) smartHouseClass.getMethod("getResidente").invoke(this.smartHouse);
    double imc = (double) residentClass.getMethod("calculaImc").invoke(otherResidente);
    assertEquals(22.86, imc, 0.01);
  }

  @Test
  @DisplayName("4 - Conexão à Internet")
  public void testConexaoInternet() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    boolean isConnected = (boolean) smartHouseClass.getDeclaredMethod("conectarInternet").invoke(this.smartHouse);


    assertTrue(isConnected);
  }

  @Test
  @DisplayName("5 - Reconhecimento de Estados")
  public void testEstados() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    String casaPE = (String) smartHouseClass.getDeclaredMethod("mostraNomeEstado", String.class).invoke(this.smartHouse, "PE");
    String casaSC = (String) smartHouseClass.getDeclaredMethod("mostraNomeEstado", String.class).invoke(this.smartHouse, "SC");
    String casaAM = (String) smartHouseClass.getDeclaredMethod("mostraNomeEstado", String.class).invoke(this.smartHouse, "AM");
    assertEquals("Pernambuco", casaPE);
    assertEquals("Santa Catarina", casaSC);
    assertEquals("Amazonas", casaAM);
  }
}

