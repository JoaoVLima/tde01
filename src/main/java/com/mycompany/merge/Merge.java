/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.merge;

import com.mycompany.fila.Fila;
import com.mycompany.listaencadeada.ListaEncadeada;

/**
 *
 * @author Lima
 */
public class Merge {
    public static Fila mergir(Fila A, Fila B){
        ListaEncadeada lista_temp = new ListaEncadeada();
        Integer nodeA = A.remove();
        while(nodeA!=null){
            lista_temp.insereOrdenado(nodeA);
            nodeA = A.remove();
        }
        
        Integer nodeB = B.remove();
        while(nodeB!=null){
            lista_temp.insereOrdenado(nodeB);
            nodeB = B.remove();
        }
        
        Fila resultado = new Fila();
        Integer node_temp = lista_temp.removePrimeiro();
        while(node_temp!=null){
            resultado.insere(node_temp);
            node_temp = lista_temp.removePrimeiro();
        }
        return resultado;
    }
}
