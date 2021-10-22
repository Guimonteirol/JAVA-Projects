/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_lavarRoupas;

/**
 *
 * @author adm
 */

//CLASSE ROUPAS CRIADA
public class Roupas {
    
    //PARÂMETROS DA CLASSE CRIADOS
    private String cor;
    private String tipo;
    private String tamanho;
    
    //ACESSO ATRÁS DAS PROPRIEDADES set e get DOS ATRIBUTOS
    public void setCor(String cor){
        this.cor = cor; /*EXPRESSÃO this USADA PARA REPRESENTAR QUE ESTOU ACESSANDO 
                           A VARIÁVEL DAQUELA CLASSE, E NÃO A QUE RECEBI VIA PARÂMETRO*/
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setTipo(String tipo){ 
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    
    public String getTamanho(){
        return this.tamanho;
    }
    
        public String exibir(){
            return "Tipo da roupa: " + this.tipo + "\n" + "Cor: " + this.cor + "\n" + "Tamanho: " + this.tamanho + "\n";
        }
    }
    

