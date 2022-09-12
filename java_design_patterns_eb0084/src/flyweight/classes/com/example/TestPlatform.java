package com.example;

/**
 *
 * @author andrebronca
 * Essa classe não existe no livro, está aqui para demonstrar o motivo do pattern
 * que será explicado.
 * O problema começa na criação da plataforma,se tiver muitos usuários, ex. 2k
 * terá pelo menos 2k de Code criado.
 * Sendo a Platform pesada para executar, haverá muito consumo de recurso.
 * A aplicação começa a ficar lenta, e geralmente são objetos parecidos
 */
public class TestPlatform {
  public static void main(String[] args) {
    Platform platform_user0001 = new JavaPlatform();
    Code code_user0001 = new Code();
    platform_user0001.execute(code_user0001);
  }
}
