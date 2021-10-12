/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula081021;

/**
 *
 * @author adm
 */
public class Funcionario extends Pessoa {
    
   
    private String salario;
    private String matricula;
    
    public void setSalario(String salario){
        this.salario = salario;
    }
    
    public String getSalario(){
        return this.salario;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    

    
    //CRIAR UM MÉTODO DE RETORNO 
    
    public String Pegardados(){
        return "Nome: "  + getNome() + "\n" + "Id: "+ getId() + "\n" + "CPF: "+ getCpf() + "\n" + "Telefone: " + getTelefone() + "\n" + "Sexo: "+ getSexo() + "\n" + "Salario: " + salario + "\n" + "Matricula: " + matricula + "\n";
    }
}
