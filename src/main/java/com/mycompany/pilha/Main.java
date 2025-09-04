/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilha;

import java.util.Scanner;

/**
 *
 * @author Lima
 */
public class Main {
    
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        boolean menu = true;
        while(menu){
            System.out.println("-- Pilha --");
            
            System.out.println("1. Inserir um elemento");
            System.out.println("2. Remover um elemento");
            System.out.println("3. Imprimir a Pilha");
            System.out.println("0. Sair");
            
            System.out.print("Digite a opcao: ");
            Scanner scanner = new Scanner(System.in);
            String opcao = scanner.next();
            
            
            if(opcao.equals("1")){
                System.out.print("Digite o valor: ");
                int valor = scanner.nextInt();
                boolean resultado = pilha.insere(valor);
                if(resultado==true){ 
                    System.out.println("Sucesso: Valor Inserido");
                }else{
                    System.out.println("Falha: Pilha Cheia");
                }
                System.out.println();
            }else if(opcao.equals("2")){
                boolean resultado = pilha.remove();
                if(resultado==true){ 
                    System.out.println("Sucesso: Valor Removido");
                }else{
                    System.out.println("Falha: Pilha Vazia");
                }
                System.out.println();
            }else if(opcao.equals("3")){
                pilha.imprime();
                System.out.println();
            }else if(opcao.equals("0")){
                menu = false;
            }
            
        }
    }
}
