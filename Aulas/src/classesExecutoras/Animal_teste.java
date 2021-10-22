/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesExecutoras;

import aula191021.Cachorro;
import aula191021.Gato;
import aula191021.Lobo;

/**
 *
 * @author adm
 */
public class Animal_teste {
    public static void main(String[] args){
        
    Cachorro dog = new Cachorro();
    
    dog.setNome("Marley");
    dog.setIdade(2);
    dog.setDoente(false);
    if(dog.getDoente() == false){
        System.out.println(dog.exibirDados());
    }
    else
        System.out.println(dog.exibirDados() + " Esse animal está doente, leve-o ao veterinário");
    
    Gato cat = new Gato();
    
    cat.setNome("Bia");
    cat.setIdade(15);
    cat.setDoente(true);
     if(cat.getDoente() == false){
        System.out.println(cat.exibirDados());
    }
    else
        System.out.println(cat.exibirDados() + " Esse animal está doente, leve-o ao veterinário");

    
    Lobo wolf = new Lobo();
    
    wolf.setNome("Gu");
    wolf.setIdade(10);
    wolf.setDoente(false);
     if(dog.getDoente() == false){
        System.out.println(wolf.exibirDados());
    }
    else
        System.out.println(wolf.exibirDados() + " Esse animal está doente, leve-o ao veterinário");
  
    
    }
}
