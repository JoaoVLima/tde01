/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilha;

/**
 *
 * @author Lima
 */
public class Pilha {
    private int capacidade;
    private int topo;
    private int dados[];
    
    public Pilha(int capacidade){
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1;
    }
    
    public boolean insere(int valor){
        if(cheia()){
            return false;
        }
        topo += 1;
        dados[topo] = valor;
        return true;
    }
    
    public boolean cheia(){
        return topo==capacidade-1;
    }
    
    public boolean vazia(){
        
        return topo==-1;
    }
    
    public boolean remove(){
        if(vazia()){
            return false;
        }
        
        topo -= 1;
        return true;
    }
    
    public void imprime(){
        System.out.print("[");
        if(topo>0){
            for(int i=0; i<topo; i++){
                System.out.print(dados[i]+",");
            }
            System.out.print(dados[topo]);
        } else if(topo==0){
            System.out.print(dados[topo]);
        }
        System.out.println("]");
    }
}
