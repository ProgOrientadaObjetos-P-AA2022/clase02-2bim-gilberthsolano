/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete4;

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
        //1. crear un objeto de estudiante presencial
        String nombre = "Rene";
        String apellido = "Elizalde";
        String identificacion = "1100";
        int edad = 36;
        EstudiantePresencial esP = new EstudiantePresencial(
                nombre, apellido, identificacion, edad);
        esP.establecerNumeroCreditos(10);
        esP.establecerCostoCredito(200);
        esP.calcularMatriculaPresencial();
        System.out.println(esP);

    }

}
