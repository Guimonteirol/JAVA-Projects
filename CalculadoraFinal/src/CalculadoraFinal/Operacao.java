package CalculadoraFinal;

public class Operacao extends Operacoes implements ICalculadoraFinal{
    
    private double resp;
    
    public double getResultado() {
        return resp;
    }

    public void setResultado(double resultado) {
        this.resp = resp;
    }

    @Override
    public double somar(double valor01, double valor02) {
        return valor01 + valor02;
    }

    @Override
    public double subtrair(double valor01, double valor02) {
        return valor01 - valor02;
    }

    @Override
    public double dividir(double valor01, double valor02) {
        return valor01 / valor02;
    }

    @Override
    public double multiplicar(double valor01, double valor02) {
        return valor01 * valor02;
    }
    
    @Override
    public double porcentagem(double valor01, double valor02){
        return (valor01 / valor02) * 100;
    }
    
    @Override
    public double calculo(double valor01, double valor02){
        resp = valor01 * valor02;
        return resp;
    }
    
}
