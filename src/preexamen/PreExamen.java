/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preexamen;

/**
 *
 * @author Cerrato
 */
import java.util.Scanner;
public class PreExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Esta es un prueva con github
         Scanner sc = new Scanner(System.in);
         
         String [] nombres= new String [5];
         double [] SalarioXhora= new double[5];
         double [] horasTrabajadas= new double[5];
         double planilla=0;

        for (int i = 0; i <= 4; i++) {
            System.out.println( (i+1)+"° Empleado" );
            nombres[i]=sc.next();
            System.out.print("Salario por Hora\n$");
            SalarioXhora[i] = sc.nextDouble();
            System.out.println("Horas Trabajadas");
            horasTrabajadas[i]=sc.nextDouble();   
        }
        
        System.out.println("-----------------PLANILLA-------------------");
        for (int i = 0; i <= 4; i++) {
            
            System.out.print("Empleado: "+nombres[i]);
            System.out.println("  Salario: $" +SalarioXhora[i]*horasTrabajadas[i]);
            planilla += SalarioXhora[i]*horasTrabajadas[i];
        }
        System.out.println("---------------------------------------------");
        System.out.println("El Total de la planilla es: $" + planilla);       
    }
}
