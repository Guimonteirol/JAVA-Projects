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
    car1.codigo = 1;
    car1.cor = "Preto";
    car1.motor = 1.8;
    car1.modelo = "Fiesta";
    car1.LigarCarro(false);
    if(car1.Acelerar(10) == 0){
        System.out.println("Carro desligado");
    }
    else{
        System.out.println("Carro acelerando... "+car1.velocidade);
    }
    System.out.println(car1.pegarDados());
    
    Carro car2 = new Carro();
    car2.codigo = 2;
    car2.cor = "Vermelho";
    car2.motor = 1.0;
    car2.modelo = "Sportage";
    System.out.println(car2.pegarDados());
    
    Carro car3 = new Carro();
    car3.codigo = 3;
    car3.cor = "Azul";
    car3.motor = 2.0;
    car3.modelo = "Corsa";
    System.out.println(car3.pegarDados());
    
    
    }
}
