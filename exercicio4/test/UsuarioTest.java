package br.com.ntconsult.exerciciossemana2.exercicio4.test;

import br.com.ntconsult.exerciciossemana2.exercicio4.classes.Usuario;
import br.com.ntconsult.exerciciossemana2.exercicio4.classes.UsuarioBase;
import br.com.ntconsult.exerciciossemana2.exercicio4.classes.UsuarioPremium;
import br.com.ntconsult.exerciciossemana2.exercicio4.classes.UsuarioStandart;

public class UsuarioTest {
    public static void main(String[] args) {
        double valorProduto = 300.0;
        double valorFrete = 100.0;

        Usuario uB = new UsuarioBase();
        Usuario uS = new UsuarioStandart();
        Usuario uP = new UsuarioPremium();

        System.out.println("Para Usuários " + uB.getTipoUsuario() + ": Desconto de " + uB.getValorDesconto(valorProduto)+ " no produto e valor do frete: " + uB.getValorFreteDesconto(valorFrete, valorProduto));
        System.out.println("Para Usuários " + uS.getTipoUsuario() + ": Desconto de " + uS.getValorDesconto(valorProduto)+ " no produto e valor do frete: " + uS.getValorFreteDesconto(valorFrete, valorProduto));
        System.out.println("Para Usuários " + uP.getTipoUsuario() + ": Desconto de " + uP.getValorDesconto(valorProduto)+ " no produto e valor do frete: " + uP.getValorFreteDesconto(valorFrete, valorProduto));

    }
}

