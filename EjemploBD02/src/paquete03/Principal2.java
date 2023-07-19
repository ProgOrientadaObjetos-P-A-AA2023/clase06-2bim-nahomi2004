/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author D E L L
 */
public class Principal2 {
    public static void main(String[] args) {
        String[][] autos = {{"LBC0001", "230.2"},
        {"LBC0002", "330.2"},
        {"LBC0003", "430.2"},
        {"LBC0004", "530.1"},
        {"LBC0005", "130.2"},};
        
        // 1. guardar en la tabla autos de la base de datos
        Enlace enlace = new Enlace();
        
        for (int i=0; i<autos.length; i++) {
            Auto auto = new Auto();
            double d = Double.parseDouble(autos[i][1]);
            
            auto.establecerPlaca(autos[i][0]);  
            auto.establecerValorMatricula(d);
            enlace.insertarAuto(auto);
        }
        // 2. presentar todos los registros de la tabla autos de la base de 
        // datos
        enlace.obtenerDataAuto();
        for (int i = 0; i < enlace.obtenerArrayList().size(); i++) {            
            System.out.printf("%s", enlace.obtenerArrayList().get(i));
        }
    }
}
