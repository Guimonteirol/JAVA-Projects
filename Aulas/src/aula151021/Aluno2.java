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
public class Aluno2 extends Pessoa2 {
    
    private String semestre;
    private String curso;
    
    public void setSemestre(String semestre){
        this.semestre = semestre;
    }
    public String getSemestre(){
        return this.semestre;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return this.curso;
    }
    
     public String exibirdados(){
          return "Nome: " + getNome() + " Idade: " + getIdade() + " Endereço: " + getEnd() + "Semestre: " + this.semestre + " Curso: " + this.curso;
     }
    
}
