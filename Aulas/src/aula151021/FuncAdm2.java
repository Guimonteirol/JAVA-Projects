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
public class FuncAdm2 extends Funcionario2 {
    
    private String setor;
    private String funcao;
    
    public void setSetor(String setor){
        this.setor = setor;
    }
    public String getSetor(){
        return this.setor;
    }
    
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    public String getFuncao(){
        return this.funcao;
    }
    
        public String exibirdados(){
            return "Nome: " + getNome() + " Idade: " + getIdade() + " Endereço: " + getEnd() + " Salario: " + getSalario() + "Setor: " + this.setor + " Função: " + this.funcao;
        }
    
}
