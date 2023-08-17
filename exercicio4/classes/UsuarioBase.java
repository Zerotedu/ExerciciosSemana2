package br.com.ntconsult.exerciciossemana2.exercicio4.classes;

public class UsuarioBase implements Usuario{
    //    getValorDesconto = ganha 5% se o valorProduto for maior que 300 reais
//    getTipoUsuario = retorna que é base
//    getValorFreteDesconto = ganha 5% se o valorProduto for maior que 300 reais
    @Override
    public Double getValorDesconto(double valorProduto){
        if(valorProduto >= 300){
            return valorProduto * 0.05;
        }
        return 0.0;
    }

    @Override
    public String getTipoUsuario(){
        return "Base";
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto){
        if(valorProduto >= 300){
            return String.valueOf(valorFrete * 0.95);
        }
        return String.valueOf(valorFrete);
    }
}
