/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fila;

/**
 *
 * @author Lima
 */
public class Fila {
    private int primeiro;
    private int ultimo;
    private int dados[];
    private int tamanho;
    private int capacidade;
    
    public Fila(int tamanho){
        this.tamanho = tamanho;
        this.dados = new int[tamanho];
        this.primeiro = 0;
        this.ultimo = -1;
        this.capacidade = 0;
    }
    
    public int adicionarUm(int variavel){
        return (variavel+1)%tamanho; 
    }
    
    public boolean cheia(){
        return capacidade==tamanho;
    }
    public boolean vazia(){
        return capacidade==0;
    }
    
    public boolean insere(int elemento){
        if(cheia()){
            return false;
        }
        capacidade++;
        ultimo = adicionarUm(ultimo);
        dados[ultimo] = elemento;
        return true;
    }
    
    public Integer remove(){
        if(vazia()){
            return null;
        }
        int elemento = dados[primeiro];
        primeiro = adicionarUm(primeiro);
        capacidade--;
        return elemento;
    }
    
    public void imprime(){
        int index = primeiro;
        System.out.print("[");
        for (int i = 0; i < capacidade; i++) {
            System.out.print(dados[index] + ",");
            index = adicionarUm(index);
        }
        System.out.println("]");
    }

}
