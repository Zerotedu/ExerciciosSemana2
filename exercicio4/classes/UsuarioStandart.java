package br.com.ntconsult.exerciciossemana2.exercicio4.classes;

public class UsuarioStandart implements Usuario{
//        getValorDesconto = ganha 15% se o valorProduto for maior que 200 reais
//        getTipoUsuario = retorna que é standart
//        getValorFreteDesconto = ganha 10% se o valorProduto for maior que 200 reais
@Override
public Double getValorDesconto(double valorProduto){
    if(valorProduto >= 200){
        return valorProduto * 0.15;
    }
    return 0.0;
}

    @Override
    public String getTipoUsuario(){
        return "Standart";
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto){
        if(valorProduto >= 200){
            return String.valueOf(valorFrete * 0.90);
        }
        return String.valueOf(valorFrete);
    }
}

