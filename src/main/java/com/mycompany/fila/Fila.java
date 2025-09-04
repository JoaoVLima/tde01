/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fila;

import com.mycompany.listaencadeada.ListaEncadeada;

/**
 *
 * @author Lima
 */
public class Fila {
    private ListaEncadeada dados;
    
    public Fila(){
        this.dados = new ListaEncadeada();
    }
    
    
    public boolean vazia(){
        return dados.vazia();
    }
    
    public boolean insere(int elemento){
        dados.insereUltimo(elemento);
        return true;
    }
    
    public Integer remove(){
        if(vazia()){
            return null;
        }
        int elemento = dados.removePrimeiro();
        return elemento;
    }
    
    public void imprime(){
        dados.imprime();
    }

}
