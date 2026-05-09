/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menu;
import com.mycompany.Biblioteca.Gestor;
import com.mycompany.ObjetosLibreria.*;
import java.util.Scanner;
import com.mycompany.Repositorio.*;


/**
 *
 * @author svrix
 */
public class MenuPrestamo extends MenuInterno<Prestamo> {

    Validaciones val = new Validaciones();
    
    Gestor<Prestamo> gp;
    Gestor<Usuario> gu; 
    Gestor<Libro> gl;    
    
    public MenuPrestamo(Gestor<Usuario> u, Gestor<Libro> l, Gestor<Prestamo> p){
        super(p);
        this.gp = p;
        this.gu = u;
        this.gl = l; 
    }
    
    @Override
    public boolean actualizarEspecial(){
        System.out.println("No puedes hacer eso");
        return false;
    }
    public void usuarioCantidad(){}
    
    public void prestamoEliminar(String ID){
        Libro z = gp.getMap(ID).getLibro();
        z.devolucionPrestamo();         
    }
    @Override
    public boolean limitador(Prestamo item){
     if(gp.limiteMap(item)<=2){
         System.out.println("No puedes hacer eso");
         return false;
    }
     return true; 
        }

    @Override
    protected void objetoEliminar(String ID){
         gp.getMap(ID).getLibro().devolucionPrestamo();
    } 

    @Override
    protected Prestamo objeto(){
        Scanner sc = new Scanner (System.in);
        String ID_usr;
        String ID_l; 
         
        System.out.println("Usuarios disponibles> ");
        System.out.println(gu.leer());
        
        while(true){
        System.out.println("ID del Usuario que se le hara prestamo> ");
        ID_usr = sc.nextLine();       
        if (val.vacio(ID_usr)){
          return null;
        }
        break;
        }
        
        System.out.println("Escribe una ID existente en la lista dada");         
        
        System.out.println("Libros disponibles> ");
      
        
        System.out.println(gl.leer());
        
        while(true){
        System.out.println("ID del libro para prestamo> ");
        
        ID_l = sc.nextLine();
        
        if (val.vacio(ID_l)){
        return null;
        }
        break;
        }

        if(gu.getMap(ID_usr) == null|| gl.getMap(ID_l) == null){
        return null;      
        }        
        
        System.out.println(gl.leer());
        gl.getMap(ID_l).prestamoRealizado();
        
        Prestamo prestamo = new Prestamo(gu.getMap(ID_usr),  gl.getMap(ID_l));
        return prestamo;
    } 
}
