/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011021;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class FormPessoa {

        private String nome;
        private double altura;
        private Date dataNascimento;
        
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public double getAltura() {
        return altura;
    }

 
    public void setAltura(double altura) {
        this.altura = altura;
    }

   
    public Date getDataNascimento() {
        return dataNascimento;
    }

  
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String pegarDados(){
        return "Nome: " + getNome() +" Altura: " + getAltura() + " Data de Nascimento: "+ getDataNascimento();
    }
    
    public int CalcularIdade(String paramData) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Date dataFormatada = sdf.parse(paramData);
        this.setDataNascimento(dataFormatada);
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataFormatada);
        int ano = calendar.get(Calendar.YEAR);
        
        Date dateAtual = new Date();
        Calendar calendarAtual = Calendar.getInstance();
        calendarAtual.setTime(dateAtual);
        int anoAtual = calendarAtual.get(Calendar.YEAR);
        
        return anoAtual - ano;
    }

    
    
    
}
