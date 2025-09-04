/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;

import java.util.Scanner;

/**
 *
 * @author Lima
 */
public class Main {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        boolean menu = true;
        while (menu) {
            System.out.println("-- Lista Encadeada --");

            System.out.println("1. Insere Ultimo");
            System.out.println("2. Insere Primeiro");
            System.out.println("3. Insere Depois");
            System.out.println("4. Insere Ordenado");
            System.out.println("5. Remove");
            System.out.println("6. Remove Primeiro");
            System.out.println("7. Remove Ultimo");
//            System.out.println("8. Remover um elemento");
            System.out.println("9. Imprimir a Pilha");
            System.out.println("0. Sair");

            System.out.print("Digite a opcao: ");
            Scanner scanner = new Scanner(System.in);
            String opcao = scanner.next();

            if (opcao.equals("1")) {
                System.out.print("Digite o valor: ");
                int valor = scanner.nextInt();
                lista.insereUltimo(valor);
                System.out.println("Sucesso: Valor Inserido");
                System.out.println();
            } else if (opcao.equals("2")) {
                System.out.print("Digite o valor: ");
                int valor = scanner.nextInt();
                lista.inserePrimeiro(valor);
                System.out.println("Sucesso: Valor Inserido");
                System.out.println();
            } else if (opcao.equals("3")) {
                System.out.print("Digite o valor: ");
                int valor = scanner.nextInt();
                System.out.print("Digite o indice em que deseja inserir: ");
                int indice = scanner.nextInt();
                lista.insereDepois(indice, valor);
                System.out.println("Sucesso: Valor Inserido");
                System.out.println();
            } else if (opcao.equals("4")) {
                System.out.print("Digite o valor: ");
                int valor = scanner.nextInt();
                lista.insereOrdenado(valor);
                System.out.println("Sucesso: Valor Inserido");
                System.out.println();
            } else if (opcao.equals("5")) {
                System.out.print("Digite o indice que deseja remover: ");
                int indice = scanner.nextInt();
                Integer elemento_removido = lista.remove(indice);
                if (elemento_removido != null) {
                    System.out.println("Sucesso: Valor " + elemento_removido + " Removido");
                } else {
                    System.out.println("Falha: Falha na remocao");
                }
                System.out.println();
            } else if (opcao.equals("6")) {
                Integer elemento_removido = lista.removePrimeiro();
                if (elemento_removido != null) {
                    System.out.println("Sucesso: Valor " + elemento_removido + " Removido");
                } else {
                    System.out.println("Falha: Falha na remocao");
                }
                System.out.println();
            } else if (opcao.equals("7")) {
                Integer elemento_removido = lista.removeUltimo();
                if (elemento_removido != null) {
                    System.out.println("Sucesso: Valor " + elemento_removido + " Removido");
                } else {
                    System.out.println("Falha: Falha na remocao");
                }
                System.out.println();
            } else if (opcao.equals("8")) {
                System.out.println();
            } else if (opcao.equals("9")) {
                lista.imprime();
                System.out.println();
            } else if (opcao.equals("0")) {
                menu = false;
            }
        }
    }
}
