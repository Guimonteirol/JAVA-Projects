/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011021_teste;

import aula011021.FormPessoa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author adm
 */
public class Teste_Pessoa_011021 {
       public static void main(String[] args) throws ParseException{
           
           FormPessoa pessoa1 = new FormPessoa();
           pessoa1.setNome("Pedro");
           pessoa1.setAltura(25);
           System.out.println(pessoa1.pegarDados());
           
           FormPessoa pessoa2 = new FormPessoa();
           pessoa2.setNome("Hosana");
           pessoa2.setAltura(19);
           String paramData = "05/03/1986";
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
           
           Date dataFormatada = sdf.parse(paramData);
           pessoa2.setDataNascimento(dataFormatada);
           
           Calendar calendar = Calendar.getInstance();
           calendar.setTime(dataFormatada);
           int ano = calendar.get(Calendar.YEAR);
           System.out.println("Ano: " + ano);
           System.out.println("Data Formatada" + sdf.format(dataFormatada ));
       }
    
}
