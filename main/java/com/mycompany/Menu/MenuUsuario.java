/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menu;
import com.mycompany.Biblioteca.Gestor;
import com.mycompany.ObjetosLibreria.Usuario;
import java.util.Scanner;
import com.mycompany.Repositorio.Validaciones;

/**
 *
 * @author svrix
 */
public class MenuUsuario extends MenuInterno<Usuario> {
    Validaciones val = new Validaciones();
    public MenuUsuario(Gestor<Usuario> gu){
    super(gu);
    }
    
    @Override
    protected Usuario objeto(){
        String nombre;
        String CL;
        String direccion;
            Scanner sc = new Scanner(System.in);
            do{
            System.out.println("Nombre>");
            nombre = sc.nextLine();
            System.out.println("CL>");
            CL = sc.nextLine();
            System.out.println("Direccion>");
            direccion = sc.nextLine();
            }while(val.caracteres(nombre)||val.caracteres(CL) || val.caracteres(direccion) 
                    || val.vacio(CL)||val.vacio(nombre)|| val.vacio(direccion));
            
            Usuario usuario = new Usuario(nombre,CL, direccion);
           
     return usuario;
     
    }
    
}
