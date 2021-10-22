/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula081021;

/**
 *
 * @author adm
 */
public class Cliente extends Pessoa{
    
   
    private String endereço;
    private int bonus;
    
    //set - atribui valores a uma variável *passa parâmetro
    //get - retorna o valor de uma variável *return
    
    public void setBonus(int bonus){
        this.bonus = bonus;
    }
    
    public int getBonus(){
        return this.bonus;
    }
    
    public void setEndereço(String endereço){
        this.endereço = endereço;
    }
    
    public String getEndereço(){
        return this.endereço;
    }
    
    //CRIAR UM MÉTODO DE RETORNO 
    
    public String Pegardados(){
        return "Nome: " + getNome() + " Id: "+ getId() + " CPF: "+ getCpf() + " Telefone: " + getTelefone() + " Sexo: "+ getSexo() + " Endereço: " + endereço + " Bonus: " + bonus + "\n" ;
    }
}
