/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menu;
import com.mycompany.Biblioteca.Gestor;
import java.util.UUID;
import java.util.Scanner;
import com.mycompany.ObjetosLibreria.*;


/**
 *
 * @author svrix
 * @param <T>
 */
abstract class MenuInterno<T extends AccionesCompartidas> {
    Gestor<T> g;
      
    public MenuInterno(Gestor<T> g){
        this.g = g;
    }
    protected abstract  T objeto();
    
    public boolean limitador(T item){
    return true;
    }
    public boolean actualizarEspecial(){ return true;}
    protected void objetoEliminar(String ID){}
    public void menuSeleccion(String seleccion){
    Scanner sc = new Scanner(System.in);
    
    String ID;
    T obj;
    String metodo;
    
    switch (seleccion){
        
        case "Crear":
            ID = UUID.randomUUID().toString();
            obj = objeto();
            if (obj == null){
            break;
            }
            metodo = g.crear(ID, obj);
           
            System.out.println(metodo);
            break;
            
        case "Eliminar":      
            System.out.println(g.leer());
            System.out.println("ID>");
            
            ID = sc.nextLine();
            objetoEliminar(ID);
            
            metodo = g.eliminar(ID);
            
            System.out.println(metodo);
            break;
            
        case "Actualizar":
            System.out.println(g.leer());
            System.out.println("ID>");
            
            ID = sc.nextLine();
            obj = objeto();
             if (!actualizarEspecial() || !limitador(obj)){
            break;
            }
            metodo = g.actualizar( ID ,obj);
            
            System.out.println(metodo);
            break;
            
        case "Ver":
            System.out.println(g.leer());
            break;
            
        default :
            System.out.println("Saliendo");
            break;
    
    }
    
    
    }
}
