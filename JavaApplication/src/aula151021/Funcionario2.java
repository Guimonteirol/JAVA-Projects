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
public class Funcionario2 extends Pessoa2 {
    
    private double salario;
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
    
        public String exibirdados(){
            return "Nome: " + getNome() + " Idade: " + getIdade() + " Endereço: " + getEnd() + " Salario: " + this.salario;
        }
}
