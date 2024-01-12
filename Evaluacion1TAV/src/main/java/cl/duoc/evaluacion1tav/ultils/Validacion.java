/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.evaluacion1tav.ultils;

import java.time.LocalDate;

/**
 *
 * @author ignac
 */
public class Validacion {
     public static boolean ValidaFecha(LocalDate fecha){
        return fecha.isBefore(LocalDate.now());
    }
}
