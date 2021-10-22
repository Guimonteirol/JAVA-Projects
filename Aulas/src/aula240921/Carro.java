/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula240921;


public class Carro {
    private int codigo;
    private String cor;
    private double motor;
    private String modelo;
    private boolean ligar = false;
    public int velocidade;
    
    public void setCodigo(int codigo){ //Uma propriedade    this - acessando o atributo da classe // como é um "set" RECEBE UM PARAMETRO codigo
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    
    public void setMotor(double motor){
        this.motor = motor;
    }
    public double getMotor(){
        return this.motor;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    
    public void setLigar(boolean ligar){
        this.ligar = ligar;
    }
    public boolean getLigar(){
        return this.ligar;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    
    
    public String pegarDados(){
        return "Código: "+ codigo+" Cor: "+ cor + " Motor: "+ motor + " Modelo: "+ modelo;
    }
    public boolean LigarCarro(boolean ligar){
        if(ligar == true){
            this.ligar = ligar;
            return this.ligar;
        }
        return this.ligar;
    }
    
    public int Acelerar(int velocidade){
        if(LigarCarro(ligar)){
            return this.velocidade = this.velocidade + velocidade;
        }
        else{
            return 0;
        }
    }
}
