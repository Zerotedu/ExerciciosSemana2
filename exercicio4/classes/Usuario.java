package br.com.ntconsult.exerciciossemana2.exercicio4.classes;

public interface Usuario {
    Double getValorDesconto(double valorProduto);
    String getTipoUsuario();
    String getValorFreteDesconto(double valorFrete, double valorProduto);

}
