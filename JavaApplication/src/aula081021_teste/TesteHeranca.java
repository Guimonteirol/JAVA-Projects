/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula081021_teste;


import aula081021.Cliente;
import aula081021.Funcionario;

public class TesteHeranca {
        //COMO AQUI É UMA CLASSE EXECUTORA (DE TESTE) CRIAR MÉTODO PRINCIPAL
    public static void main(String[] args){ //MÉTODO EXECUTÁVEL
        
        Cliente X = new Cliente(); //OBJETO
        
       X.setNome("Guilherme");
       X.setId(01);
       X.setCpf(Long.MIN_VALUE);
       X.setSexo("M");
       X.setTelefone("71997153312");
       X.setEndereço("Rua Politeama");
       X.setBonus(5);
       System.out.println(X.Pegardados());
       
       
        Funcionario Y = new Funcionario();
        
        Y.setNome("Gustavo");
        Y.setId(02);
        Y.setCpf(Long.MAX_VALUE);
        Y.setSexo("M");
        Y.setTelefone("7199715331");
        Y.setSalario("500");
        Y.setMatricula("00999");
        System.out.println(Y.Pegardados());
        
    }
}
