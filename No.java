/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adalberto.bcpereira
 */
public class No {
    private  List<No> vizinhos = new ArrayList();
    private String nome;
    //geters and seters
    
    public No (String nome)
    {
        setNome(nome);       
    }

    public List<No> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(List<No> vizinhos) {
        this.vizinhos = vizinhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void imprimeVizinho()
    {
         for (No no: vizinhos)
         {
             System.out.print(no.getNome()+" ");
         }
    }
    
}
