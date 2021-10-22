/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligarcarro;

/**
 *
 * @author adm
 */
public class Carro {

     private double motor;
    private String cor;
    private String modelo;
    private boolean ligar = false;
    private int velocidade = 0;
    
    public void setMotor(double motor){
        this.motor = motor;
    }
    
    public double getMotor(){
        return this.motor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return this.cor;
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
                
    public String exibirdados(){
        return " O modelo do carro é: " + getModelo() +"\n "+"A cor do carro é: " + getCor() +"\n " + "O motor do carro é: " + getMotor();
    }
    
    //CRIAR UM MÉTDO PARA LIGAER E ACELAR O CARRO
    
    public boolean LigarCarro(boolean ligar){
        if(ligar == true){
            this.ligar = ligar;
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
    
    public boolean DesligarCarro(boolean ligar){
        if(ligar == false){
            this.ligar = ligar;
            this.velocidade = 0;
        }
        return this.ligar;
    }
    
}
