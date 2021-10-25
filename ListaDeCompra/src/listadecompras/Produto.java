/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadecompras;

/**
 *
 * @author adm
 */
public class Produto {
    
    private String nome;
    private double preco;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco =  preco;
    }
}
