/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listaencadeada;

/**
 *
 * @author Lima
 */
public class ListaEncadeada {
    private Node Lista;

    public ListaEncadeada() {
        this.Lista = null;
    }
    
    public boolean vazia(){
        return Lista==null; 
    }

    //Inserindo elementos
    public void insereUltimo(int informacao) {
        //Declarando nosso novo nó
        Node no = new Node();
        no.setInformacao(informacao);
        if (vazia()) {
            Lista = no;
        } else {
            //Aqui se cria um apontador para a lista.
            Node atual = Lista;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(no);
            System.out.println("Nó atual no endereço" + atual);
        }
    }
    
    public void inserePrimeiro(int info){
        Node no = new Node();
        no.setInformacao(info);
        if (vazia()) {
            Lista = no;
        } else {
            Node atual = Lista;
            no.setProximo(atual);
            Lista = no;
        }
    }
    
    public void insereDepois(int indice, int info){
        Node no = new Node();
        no.setInformacao(info);
        if (vazia()) {
            Lista = no;
        }else if(indice==0){
            inserePrimeiro(info);
        }else {
            Node atual = Lista;
            Node atualProximo = atual.getProximo();
            int contador = 1;
            while (atualProximo != null && contador!=indice) {
                atual = atual.getProximo();
                atualProximo = atual.getProximo();
                contador++;
            }
            if(contador!=indice){
                System.out.println("Indice não encontrado");
            }else{
                no.setProximo(atualProximo);
                atual.setProximo(no);
                System.out.println("Nó atual no endereço" + atual);
            }
        }
        
    }
    
    public void insereDepois(Node node, int info){
        Node no = new Node();
        no.setInformacao(info);
        if (vazia()) {
            Lista = no;
//        }else if(node==Lista){
//            inserePrimeiro(info);
        }else {
            Node atual = Lista;
            Node atualProximo = atual.getProximo();
            while (atualProximo != null && node!=atual) {
                atual = atual.getProximo();
                atualProximo = atual.getProximo();
            }
            if(node!=atual){
                System.out.println("Indice não encontrado");
            }else{
                no.setProximo(atualProximo);
                atual.setProximo(no);
                System.out.println("Nó atual no endereço" + atual);
            }
        }
    }
    
    public void insereOrdenado(int info){
        
        //2
        //[1,3,4,5,6,10]
        //[1,2,3,4,5,6,10]
        //40
        //[1,2,3,4,5,6,10,40]
        //9
        //[1,2,3,4,5,6,9,10,40]
        
        
        Node no = new Node();
        no.setInformacao(-1);
        
        Node atual = Lista;
        Node maior = no;
        
        if (vazia()) {
            inserePrimeiro(info);
            return;
        }
        
        while (atual.getProximo() != null) {
            
            if(atual.getInformacao()<info && info>maior.getInformacao()){
                maior = atual;
            }
            
            
            atual = atual.getProximo();
        }
        
        if(atual.getInformacao()<info && info>maior.getInformacao()){
            maior = atual;
        }
        
        if(maior.getInformacao()==-1){
            inserePrimeiro(info);
        }else{
            insereDepois(maior, info);
        }
        
    }
    
    //Removendo elementos
    public Integer remove(int indice){
        if(vazia()){
            return null;
        }
        if(indice==0){
            return removePrimeiro();
        }
        
        Node atual = Lista;
        Node atualProximo = atual.getProximo();
        Integer info;
        
        if(atualProximo == null){
            info = atual.getInformacao();
            Lista = null;
            return info;
        }
        
        while (atualProximo!=null && atualProximo.getProximo() != null) {
            atual = atual.getProximo();
            atualProximo = atual.getProximo();
        }
        
        info = atualProximo.getInformacao();
        atual.setProximo(null);
        return info;
    }
    
    public Integer remove(Node node){
        if(vazia()){
            return null;
        }
        if(node==Lista){
            return removePrimeiro();
        }
        
        Node atual = Lista;
        Node atualProximo = atual.getProximo();
        
        Integer info = null;
        
        while (atual.getProximo() != null && atual!=node) {
            atual = atual.getProximo();
        }
        
        info = atual.getInformacao();
        atual.setProximo(null);
        
        return info;
    }
    
    public Integer removePrimeiro(){
        if(vazia()){
            return null;
        }
        Integer info = Lista.getInformacao();
        Node proximo = Lista.getProximo();
        
        
        Lista = proximo;
        return info;
        
    }
    
    public Integer removeUltimo(){
        if(vazia()){
            return null;
        }
        
        Node atual = Lista;
        Node atualProximo = atual.getProximo();
        Integer info;
        
        if(atualProximo == null){
            info = atual.getInformacao();
            Lista = null;
            return info;
        }
        
        while (atualProximo!=null && atualProximo.getProximo() != null) {
            atual = atual.getProximo();
            atualProximo = atual.getProximo();
        }
        
        info = atualProximo.getInformacao();
        atual.setProximo(null);
        return info;
    }
    
    //Imprimindo elementos
    public void imprime() {
        Node atual = Lista;
        while (atual != null) {
            System.out.print(atual.getInformacao() + " -> ");
            atual = atual.getProximo();
        }
        System.out.println("Null");
    }
    
}