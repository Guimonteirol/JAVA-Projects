/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula240921;


public class Carro {
    public int codigo;
    public String cor;
    public double motor;
    public String modelo;
    public boolean ligar = false;
    public int velocidade;
    
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
