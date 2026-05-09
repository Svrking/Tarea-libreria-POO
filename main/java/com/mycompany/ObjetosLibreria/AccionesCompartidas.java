/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ObjetosLibreria;

/**
 *
 * @author svrix
 */

abstract public class AccionesCompartidas {
   private final String tipo;
   
   public AccionesCompartidas(String tipo){
   this.tipo = tipo;
   } 
   public abstract String getNombreString();
   
   public Boolean comparacionNombre(String item){   
     return item.equalsIgnoreCase(getNombreString());
  }
   public String getTipo(){
   return this.tipo;
   }
}
