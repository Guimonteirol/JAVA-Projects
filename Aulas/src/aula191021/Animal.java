/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula191021;

/**
 *
 * @author adm
 */
public class Animal {
    
    private String nome;
    private int idade;
    private boolean doente = false;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    
    public void setDoente(boolean doente){
        this.doente = doente;
    }
    public boolean getDoente(){
        return this.doente;
    }
    
     public String fazBarulho(){  
        return " Esse animal faz Barulho" + "\n";
    }
     
     public String procuraComida(){
         return " Esse animal caça a comida" + "\n";
     }
     
     public String exibirDados(){
         return " O nome desse animal é: " + getNome() + " A idade: " + getIdade() + "Ele está doente: " + getDoente() + fazBarulho() + procuraComida();
     }
    
}
