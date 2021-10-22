/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula240921_teste;

import aula240921.Carro;


public class Teste_carro_240921 {
    public static void main(String[] args){
    Carro car1 = new Carro();
    car1.setCodigo(1);
    car1.setCor( "Preto");
    car1.setMotor(1.8);
    car1.setModelo("Fiesta");
    car1.LigarCarro(false);
    if(car1.Acelerar(10) == 0){
        System.out.println("Carro desligado");
    }
    else{
        System.out.println("Carro acelerando... "+car1.velocidade);
    }
    System.out.println(car1.pegarDados());
    
    Carro car2 = new Carro();
    car2.setCodigo(2);
    car2.setCor ( "Vermelho");
    car2.setMotor (1.0);
    car2.setModelo("Sportage");
    System.out.println(car2.pegarDados());
    
    Carro car3 = new Carro();
    car3.setCodigo(3);
    car3.setCor("Azul");
    car3.setMotor(2.0);
    car3.setModelo("Corsa");
    System.out.println(car3.pegarDados());
    
    
    }
}
