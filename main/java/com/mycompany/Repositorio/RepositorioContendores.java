/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Repositorio;


/**
 *
 * @author svrix
 */
public class RepositorioContendores {
    public RepositorioContendores(){}
    
    public String imprimirLista(String[] opciones){
        String val = "";
        for(int i = 0; i < opciones.length; i++){
         int n = i+1;
         val += "\n" + n + " " + opciones[i];
        }    
        return val;
    }
    
}
