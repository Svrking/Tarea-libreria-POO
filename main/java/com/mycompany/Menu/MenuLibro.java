/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menu;

import com.mycompany.Biblioteca.Gestor;
import com.mycompany.ObjetosLibreria.Libro;
import java.util.Scanner;
import com.mycompany.Repositorio.Validaciones;
import java.util.InputMismatchException;
/**
 *
 * @author svrix
 */
public class MenuLibro extends MenuInterno<Libro>{
    Validaciones val = new Validaciones();
    protected Gestor<Libro> gl;
   
    public MenuLibro(Gestor<Libro> gl){
      super(gl);
      this.gl = gl;
    }
    
    @Override
    protected Libro objeto(){
    String titulo;
    String autor;
    int existencias = 0;
    Scanner sc = new Scanner(System.in);
    
    while(true){
    System.out.println("Titulo>");
    titulo = sc.nextLine();
    if (!val.caracteres(titulo) && !val.vacio(titulo) ){break;}
    }
    
    while(true){
    System.out.println("Autor>");
    autor = sc.nextLine();
    if (!val.caracteres(autor) && !val.vacio(titulo)){break;} 
    }    
    
    while(true){
    try{
    System.out.println("Existencias>");
    existencias = sc.nextInt();}
    catch(InputMismatchException e){
    System.out.println("Ingresa un entero");  
    sc.next();
    continue;
    }
    
    if (!val.menorCero(existencias) ) {
        break;
      }   
    }
    return new Libro(titulo,autor,existencias);   
    
    }
    
}
