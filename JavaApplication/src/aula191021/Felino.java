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
public class Felino extends Animal {
    public String miar(){
        return " Esse animal mia" + "\n";
    }
    
     public String exibirDados(){
         return " O nome desse animal é: " + getNome() + " A idade: " + getIdade() + "Ele está doente: " + getDoente() + fazBarulho() + procuraComida() + miar();
     }
}
