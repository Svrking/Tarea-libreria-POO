/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Repositorio;

/**
 *
 * @author svrix
 */
public class Validaciones {
    public Validaciones(){}

    public boolean caracteres(String item) {
        if (item.matches(".*[!@#$%^&*()].*")) {
            System.out.println("No pueden existir caracteres especiales.");
            return true; // error
        }
        return false;
    }

    public boolean vacio(String item) {
        if (item.isBlank()) {
            System.out.println("El campo no puede estar vacío.");
            return true; // error
        }
        return false;
    }

    public boolean esEntero(String item) {
        try {
            Integer.valueOf(item);
            return true; // válido
        } catch (NumberFormatException e) {
            System.out.println("Debe ser un número entero válido.");
            return false;
        }
    }

    public boolean menorCero(int item) {
        if (item <= 0) {
            System.out.println("Ingresa un valor mayor a 0.");
            return true; // error
        }
        return false;
    }

}
