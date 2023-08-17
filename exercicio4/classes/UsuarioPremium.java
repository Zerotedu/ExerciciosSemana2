package br.com.ntconsult.exerciciossemana2.exercicio4.classes;

public class UsuarioPremium implements Usuario{
//    getValorDesconto = ganha 30% se o valorProduto for maior que 200 reais
//    getTipoUsuario = retorna que é premium
//    getValorFreteDesconto = ganha frete grátis se o valorProduto for maior que 100 reais
    @Override
    public Double getValorDesconto(double valorProduto){
        if(valorProduto >= 200){
            return valorProduto * 0.3;
        }
        return 0.0;
    }

    @Override
    public String getTipoUsuario(){
        return "Premium";
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto){
        if(valorProduto >= 100){
            return "Frete gratis";
        }
        return String.valueOf(valorFrete);
    }
}
