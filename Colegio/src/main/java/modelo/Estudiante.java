/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JOptionPane;

import javax.swing.JPanel;

public class Estudiante {
    private String nombre;
    private int id;
    private int edad;
    private double matematicas;
    private double ciencias;
    private double ingles;
    private double prom;

    public Estudiante() {
    }

    
    public Estudiante(String nombre, int id, int edad, double matematicas, double ciencias, double ingles) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.matematicas = matematicas;
        this.ciencias = ciencias;
        this.ingles = ingles;
        this.prom = calcProm();
    }

    public double calcProm(){
        this.prom=(this.matematicas + this.ciencias + this.ingles)/3;
        return this.prom;
    }
    Estudiante [] estudiantes  = new Estudiante [2];
    
    public void registroEst(){
        
        for(int i=0;i<=1;i++){
            JOptionPane.showMessageDialog(null, "REGISTRO DE INFORMACION DE ESTUDIANDE #"+(i+1));
            //System.out.println("REGISTRO DE INFORMACION DEL ESTUDIANTE #"+(i+1)+"\n");
            Scanner sc = new Scanner(System.in);
            
            //String nombre = sc.nextLine();
            String nombre = JOptionPane.showInputDialog("Digite el nombre: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad: "));
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite el documento: "));
            double matematicas = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota de matematicas: "));
            double ciencias = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota de ciencias: "));
            double ingles = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota de ingles: "));
            Estudiante est = new Estudiante(nombre, id, edad, matematicas, ciencias, ingles);
            estudiantes[i]=est;
        }
    }
    
    public void informacionEst(){
        for(int i=0;i<=1;i++){
            System.out.println("\nINFORMACION DEL ESTUDIANTE #"+(i+1));
            JOptionPane.showMessageDialog(null, "INFORMACION ESTUDIANTE #"+(i+1)+
                    "\nNombre: "+estudiantes[i].getNombre()+
                    "\nEdad: "+estudiantes[i].getEdad()+
                    "\nDocumento: "+estudiantes[i].getId()+
                    "\nMatematicas: "+estudiantes[i].getMatematicas()+
                    "\nCiencias: "+estudiantes[i].getCiencias()+
                    "\nIngles: "+estudiantes[i].getIngles()+
                    "\nPromedio: "+estudiantes[i].getProm());
        }
    }

    public void organizarPorEdad(){
        Arrays.sort(estudiantes,Comparator.comparingInt(Estudiante::getEdad));
        JOptionPane.showMessageDialog(null, "ESTUDIANTES ORDENADOS POR EDAD DE MENOR A MAYOR:");
        informacionEst();
        
    }
    
    public void organizarPorProm(){
        Arrays.sort(estudiantes,Comparator.comparingDouble(Estudiante::getProm).reversed());
        JOptionPane.showMessageDialog(null, "ESTUDIANTES ORDENADOS POR PROMEDIO DE MAYOR A MENOR:");
        informacionEst();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getMatematicas() {
        return matematicas;
    }

    public void setMatematicas(double matematicas) {
        this.matematicas = matematicas;
    }

    public double getCiencias() {
        return ciencias;
    }

    public void setCiencias(double ciencias) {
        this.ciencias = ciencias;
    }

    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
    
    
    
    
    
    
    
}
