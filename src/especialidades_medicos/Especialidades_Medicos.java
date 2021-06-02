/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package especialidades_medicos;

import java.util.Scanner;

/**
 *
 * @author 60008
 */
public class Especialidades_Medicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Clase miClase = new Clase();
    Scanner entrada = new Scanner(System.in);
    
    miClase.setCod_Esp(entrada.nextLine());
    miClase.setNro_Leg(entrada.nextLine());
    
    System.out.println(miClase.getCod_Esp());
    System.out.println(miClase.getNro_Leg());
    }
    
}
