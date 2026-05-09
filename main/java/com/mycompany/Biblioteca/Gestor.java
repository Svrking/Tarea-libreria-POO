/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Biblioteca;
import java.util.Map;
import java.util.HashMap;
import com.mycompany.ObjetosLibreria.AccionesCompartidas;
/**
 *
 * @author svrix
 * @param <T>
 */

public class Gestor<T extends AccionesCompartidas>{
    protected Map<String , T> map = new HashMap<>();

    public Gestor(){} 
    public String crear(String ID ,T item){
        if (item == null){
         return "vuelve cuando lo puedas crear";
        }
        if (map.containsValue(item)){
        return "\nEse valor ya esta en la Tabla ";
        }
        for (T valor : map.values()){
        if (valor.comparacionNombre(item.getNombreString())){
         return "\nYa esta registrado ese " + item.getTipo();
          }
        }
        
        map.putIfAbsent(ID, item);
        return "\nValor creado " + item;
    }
   
    public String eliminar(String ID){
        if (map.containsKey(ID)){
        map.remove(ID);
        return "Removido";
        }
        return "Ese valor no existe ";
    }
    
    public String leer(){
    String retorno = " \nNo hay nada para iterar";
    if (!map.isEmpty()){
    retorno = "";
    for (Map.Entry<String, T> entry : map.entrySet()) {
       retorno += "\n" + entry.getKey() + " : " + entry.getValue().toString();
    }  
      return retorno;
    }
     return retorno; 
    } 

    public String actualizar(String ID, T new_item){
        if (map.containsKey(ID)){
        map.replace(ID, new_item);
        return "\nActualizacion realizada ";
        }
        return "\nEse valor no existe ";
    }
    
    public T getMap(String ID){
       return map.get(ID);
               }
    
    public boolean isItInMap(T value){
        return map.containsValue(value);
    }
   
    public int sizeMap(){
        return map.size();
    }
    
    public int limiteMap(T valor){
    int count = 0;
    for (Map.Entry<String, T> entry : map.entrySet()){
      if (entry.getValue().getNombreString().equals(valor.getNombreString())){
      count +=1;
      }
    }
      return count;
    }
}

