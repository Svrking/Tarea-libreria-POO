/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Main;
import com.mycompany.Menu.Menu;
import java.util.Scanner;
import com.mycompany.Repositorio.RepositorioContendores;
import java.util.InputMismatchException;
/**
 *
 * @author svrix
 */
public class Main {
    protected static String[] opciones = {"Crear", "Actualizar","Eliminar" ,"Leer", "Salir"};  
    static Menu menu = new Menu();
    public static void main(String[] args) {
       OU:
       while(true){
        Scanner sc = new Scanner(System.in);
        
        RepositorioContendores listvista = new RepositorioContendores();
        System.out.println(listvista.imprimirLista(opciones));
        
        int seleccion;
        
        try{
        seleccion = sc.nextInt();
        }
        
        catch (InputMismatchException  e){
        System.out.println("Ingresa un entero o un numero");
        continue;
        }
        
        if (seleccion <= 0 ){
            System.out.println("Numeros mayores a 0");
            continue;
        }
        
        switch (seleccion){
            case 1: 
                menu.mostrarMenu("Crear");
                break;
            case 2: 
                menu.mostrarMenu("Actualizar");
                break;
            case 3: 
                menu.mostrarMenu("Eliminar");   
                break;
           case 4: 
                menu.mostrarMenu("Ver");
                break;
           default:
                break OU;
        }
        }
    }
}
