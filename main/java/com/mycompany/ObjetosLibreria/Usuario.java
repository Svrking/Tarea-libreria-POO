/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ObjetosLibreria;

/**
 *
 * @author svrix
 */
interface AccionesUsuario{ 
    String getUsuarioNombre();
    void setUsuarioNombre(String usuario_nombre);
    
    String getCL();
    void setCL(String cl);
    
    String getDireccion();
    void setDireccion(String direccion);  
    String getTipo();
}

public class Usuario extends AccionesCompartidas implements AccionesUsuario {
    
    private String usuario_nombre;
    private String cl;
    private String direccion;
    
    public Usuario (String usuario_nombre, String cl, String direccion){
     super("Usuario");
    
    if (usuario_nombre == null || cl == null || direccion == null){
       throw new IllegalArgumentException("Usuario, Credencial de Lector o direccion no pueden ser null");
     }
    this.usuario_nombre = usuario_nombre;
    this.cl = cl;
    this.direccion = direccion;
    }
    
    @Override
    public String getNombreString(){
    return this.usuario_nombre;
    }
    @Override
    public String getUsuarioNombre(){
    return this.usuario_nombre;
    }
    @Override
    public void setUsuarioNombre(String usuario_nombre){
    this.usuario_nombre = usuario_nombre;
    }
    
    @Override
    public void setCL(String cl){
    this.cl = cl;
    }
    @Override
    public String getCL( ){
    return this.cl;
    }
    
    @Override
    public void setDireccion(String direccion){
    this.direccion = direccion;
    }
    @Override 
    public String getDireccion(){
    return this.direccion;
    }        
    
    @Override
    public String toString(){
    return "\nUsuario> " + getUsuarioNombre() + ", direccion> " + getDireccion() + ", credencial de lector> " + getCL();
    }
}
