/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Biblioteca;

import com.mycompany.ObjetosLibreria.*;

/**
 *
 * @author svrix
 */
public class GestorTipos {
    Gestor<Usuario> gu= new Gestor<>();
    Gestor<Libro> gl= new Gestor<>();
    Gestor<Prestamo> gp = new Gestor<>();
    
    public GestorTipos(){}
    
    public Gestor<Libro> gestorLibro(){
        return gl;
    }
    public Gestor<Usuario> gestorUsuario(){
        return gu;
    }
    public Gestor<Prestamo> gestorPrestamo(){
        return gp;
    }
    
}
