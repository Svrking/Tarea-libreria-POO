/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menu;
import com.mycompany.Repositorio.RepositorioContendores;
import java.util.Scanner;
import com.mycompany.Biblioteca.*;
import java.util.InputMismatchException;

/**
 *
 * @author svrix
 */
public class Menu {
    GestorMenu gm = new GestorMenu();
    
    String[] opciones = {"Libro", "Usuario", "Prestamo", "Salir"};
    
    Scanner sc = new Scanner(System.in);
    RepositorioContendores repo = new RepositorioContendores();

    public void mostrarMenu(String forma){
        int seleccion;
        System.out.println(repo.imprimirLista(opciones));
        
        while(true){
    try{
        System.out.println("Ingresa un número> ");
        seleccion = sc.nextInt();
        break;
    }
    catch(InputMismatchException e){
        System.out.println("Error: ingresa un numero valido");
        sc.nextLine();
    }
}      
        switch(seleccion){
            case 1:
                gm.menuLibro().menuSeleccion(forma);
                break;

            case 2:
                gm.menuUsuario().menuSeleccion(forma);
                break;

            case 3:
                gm.menuPrestamo().menuSeleccion(forma);
                break;

            default:
                System.out.println("Saliendo");
                break;
        }
    }
}
