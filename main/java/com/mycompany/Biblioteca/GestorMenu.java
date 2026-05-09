/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Biblioteca;

import com.mycompany.Menu.*;

/**
 *
 * @author svrix
 */
public class GestorMenu{
    
    GestorTipos gl = new GestorTipos();
    
    private final MenuLibro l = new MenuLibro(gl.gestorLibro());
    private final MenuUsuario u = new MenuUsuario(gl.gestorUsuario());
    private final MenuPrestamo p = new MenuPrestamo(gl.gestorUsuario(),gl.gestorLibro(),gl.gestorPrestamo());   
    
    public MenuLibro menuLibro(){
        return l;
    }
    public MenuUsuario menuUsuario(){
        return u;
    }
    public MenuPrestamo menuPrestamo(){
        return p;
    }
    
}
