/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes_classes;

import sistema_lavarRoupas.Roupas;

/**
 *
 * @author adm
 */
public class Roupas_teste {
    public static void main(String[] args){ //CRIANDO CLASSE EXECUTORA
        Roupas peça1 = new Roupas(); //CRIANDO OBJETO
         peça1.setCor("Azul");  /*ACESSANDO OS ATRIBUTOS ATRAVÉS DA PROPRIEDADE set
                                    QUE VAI ENVIAR O VALOR PARA PARA A VARIÁVEL  */
         peça1.setTipo("Calça");
         peça1.setTamanho(43);
         System.out.println(peça1.exibir());
         
         Roupas peça2 = new Roupas();
         peça2.setCor("Branco");
         peça2.setTipo("Camisa");
         peça2.setTamanho(40);
         System.out.println(peça2.exibir());
         
         Roupas peça3 = new Roupas();
         peça3.setCor("Verde");
         peça3.setTipo("Vestido");
         peça3.setTamanho(39);
         System.out.println(peça3.exibir());
    }
}
