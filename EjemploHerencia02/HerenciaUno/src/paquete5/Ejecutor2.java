/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete5;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Ejecutor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudiantePresencial esp1= new EstudiantePresencial("Gilbert", "Solano", "1105059404", 24, 10, 100);
        esp1.calcularMatriculaPresencial();
        System.out.println(esp1);
        
    }
    
}
