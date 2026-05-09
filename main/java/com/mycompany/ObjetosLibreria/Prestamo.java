/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ObjetosLibreria;
import com.mycompany.Biblioteca.Gestor;
/**
 *
 * @author svrix
 */
interface PrestamoAcciones{
    Usuario getUsuario();
    void setUsuario(Usuario usuario);
    
    public Libro getLibro();
    public void setLibro(Libro libro);
}

public class Prestamo extends AccionesCompartidas implements PrestamoAcciones {
    Gestor<Usuario> g = new Gestor<>();
    
    Usuario usuario;
    Libro libro;    
 
 public Prestamo(Usuario usuario, Libro libro){
  super("Prestamo");
  this.usuario = usuario;  
  this.libro = libro;
 }

 @Override
   public String getNombreString(){
    return this.usuario.getNombreString();
    }
 @Override
 public Usuario getUsuario(){
  return usuario;
 }
 @Override
 public void setUsuario(Usuario usuario){
  this.usuario = usuario;
 }
 
 @Override
 public Libro getLibro(){
  return libro;
 }
 @Override
 public void setLibro(Libro libro){
  this.libro = libro;
 }
 
 @Override 
 public String toString(){
  return "\nUsuario de prestamo> " + getUsuario().getUsuarioNombre() + ", prestado libro> " + getLibro().getTitulo();
 }
}
