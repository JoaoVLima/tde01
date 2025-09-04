/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fila;

import java.util.Scanner;

/**
 *
 * @author Lima
 */
public class Main {
    
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        boolean menu = true;
        while(menu){
            System.out.println("-- Fila --");
            
            System.out.println("1. Inserir um elemento");
            System.out.println("2. Remover um elemento");
            System.out.println("3. Imprimir a Fila");
            System.out.println("0. Sair");
            
            System.out.print("Digite a opcao: ");
            Scanner scanner = new Scanner(System.in);
            String opcao = scanner.next();
            
            
            if(opcao.equals("1")){
                System.out.print("Digite o valor: ");
                int valor = scanner.nextInt();
                boolean resultado = fila.insere(valor);
                if(resultado==true){ 
                    System.out.println("Sucesso: Valor Inserido");
                }else{
                    System.out.println("Falha: Fila Cheia");
                }
                System.out.println();
            }else if(opcao.equals("2")){
                Integer resultado = fila.remove();
                if(resultado!=null){ 
                    System.out.println("Sucesso: Valor Removido");
                }else{
                    System.out.println("Falha: Fila Vazia");
                }
                System.out.println();
            }else if(opcao.equals("3")){
                fila.imprime();
                System.out.println();
            }else if(opcao.equals("0")){
                menu = false;
            }
            
        }
    }
}
