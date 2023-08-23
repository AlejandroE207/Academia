/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package vista;

import modelo.Estudiante;
import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class Colegio {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.registroEst();
        estudiante.informacionEst();
        estudiante.organizarPorEdad();
        estudiante.organizarPorProm();

    }
}
