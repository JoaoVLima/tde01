/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tde01;

import com.mycompany.fila.Fila;
import com.mycompany.pilha.Pilha;
import java.util.Scanner;

/**
 *
 * @author Lima
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Main.pilha();
    }
    
    public static void pilha(){
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
    
    public static void fila(){
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
