/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ObjetosLibreria;


/**
 *
 * @author svrix
 */
interface LibrosAcciones{
    void setAutor(String autor);
    String getAutor();
    
    void setExistencia(int existencias);
    int getExistencia();
    
    void setTitulo(String titulo);
    String getTitulo();
    
    String prestamoRealizado();
    String devolucionPrestamo();
    String getTipo();
}

public class Libro extends AccionesCompartidas implements LibrosAcciones {
    private String titulo;
    private String autor;
    private int existencias;
    
    
public Libro(String titulo, String autor, int existencias){
   super("Libro");
   this.titulo = titulo;
   this.autor = autor;
   this.existencias = existencias;
 } 
   
   @Override
   public String getNombreString(){
    return this.titulo;
    }
    
  @Override
  public void setAutor(String autor){
   this.autor = autor;
  }
  @Override
  public String getAutor(){
   return autor;
  }
  
  @Override 
  public void setExistencia(int existencias){
   this.existencias = existencias;
  }
  @Override
  public int getExistencia(){
   return existencias;
  }
  
  @Override
  public void setTitulo(String titulo){
   this.titulo = titulo;
  }
  @Override
  public String getTitulo(){
   return titulo;    
  }
  
  @Override
  public String prestamoRealizado(){
   if(getExistencia() <= 0){
       return "\nNo hay copias para dar de este libro"; 
   }
   setExistencia(getExistencia() - 1); //Se le resta una existencia a los libros existentes.
   return "\nPrestamo hecho a " ;
  }
  @Override 
  public String devolucionPrestamo(){
  if(getExistencia() <= 0){
       return "\nNo hay copias para dar de este libro";
   }
  setExistencia(getExistencia() + 1);
  
  return """
         
         Prestamos hecho a . Copias disponibles """ + getExistencia();
  }
  
  @Override
  public String toString(){
  return "\nTitulo> " + getTitulo()+ ", autor> " + getAutor()+ ", existenciass> "  + String.valueOf(getExistencia());}

} 

