/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_aula240921;

import aula240921.Arvore;


public class Teste240921 {
    public static void main(String[] args){
        Arvore arv1 = new Arvore();
        arv1.codigo = 1;
        arv1.tipo = "Coqueiro";
        System.out.println(arv1.pegarDados()); /*ESSE É UM MÉTODO NA ÁRVORE P EXIBIR AS INFORMAÇÕES*/
        
        Arvore arv2 = new Arvore();
        arv2.codigo = 2;
        arv2.tipo = "Macieira";
        System.out.println(arv2.pegarDados());
        
        Arvore arv3 = new Arvore();
        arv3.codigo = 3;
        arv3.tipo ="Pinheiro";
        System.out.println(arv3.pegarDados());
        
        
    }
}
