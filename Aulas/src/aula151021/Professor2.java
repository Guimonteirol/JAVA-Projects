/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula151021;

/**
 *
 * @author adm
 */
public class Professor2 extends Funcionario2{
    
      private String disciplina;
      
      public void setDisciplina(String disciplina){
          this.disciplina = disciplina;
      }
      public String getDisciplina(){
          return this.disciplina;
      }
      
      public String exibirdados(){
            return "Nome: " + getNome() + " Idade: " + getIdade() + " Endereço: " + getEnd() + " Salario: " + getSalario() + " Disciplina: " + this.disciplina;
      }
}
