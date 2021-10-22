/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula151021_teste;

import aula151021.Aluno2;
import aula151021.FuncAdm2;
import aula151021.Funcionario2;
import aula151021.Professor2;

/**
 *
 * @author adm
 */
public class JHeranca2 {
    public static void main(String[] args){
        
        Professor2 prof = new Professor2();
        
        prof.setNome("Anildo");
        prof.setIdade(40);
        prof.setEnd("Rua Tiradentes");
        prof.setSalario(1500.00);
        prof.setDisciplina("Desenvolvimento de Sistemas");
        System.out.println(prof.exibirdados());
        
        FuncAdm2 adm = new FuncAdm2();
        
        adm.setNome("Lara");
        adm.setIdade(23);
        adm.setEnd("Rua Brotas");
        adm.setSalario(2500.00);
        adm.setSetor("Administração");
        adm.setFuncao("Organizar Disciplinas");
        System.out.println(adm.exibirdados());
        
        Funcionario2 func = new Funcionario2();
        
        func.setNome("Vanessa");
        func.setIdade(20);
        func.setEnd("Rua da Tripa");
        func.setSalario(1000.00);
        System.out.println(func.exibirdados());
        
        Aluno2 alun = new Aluno2();
        
        alun.setNome("Guilherme");
        alun.setIdade(20);
        alun.setEnd("Rua Politeama");
        alun.setSemestre("Segundo");
        alun.setCurso("Bacharelado Interdsciplinar em Ciências e Tecnologias");
        System.out.println(alun.exibirdados());
     
        
        
        
    }
    
    
    
}
