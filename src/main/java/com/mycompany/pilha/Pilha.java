/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilha;

import com.mycompany.listaencadeada.ListaEncadeada;

/**
 *
 * @author Lima
 */
public class Pilha {
    private ListaEncadeada dados;
    
    public Pilha(){
        this.dados = new ListaEncadeada();
    }
    
    public boolean insere(int valor){
        dados.insereUltimo(valor);
        return true;
    }
    
    public boolean vazia(){
        return dados.vazia();
    }
    
    public Integer remove(){
        if(vazia()){
            return null;
        }
        Integer info = dados.removeUltimo();
        return info;
    }
    
    public void imprime(){
        dados.imprime();
    }
}
