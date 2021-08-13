/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
/**
 *
 * @author B14
 */
public class Taller1 {

    
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.print("Hola, estas hablando con el nuevo programa de operaciones");
        System.out.print("");
        System.out.print("¿Que operacion desea realizar? ");
        System.out.print("");
        System.out.print("1) Union");
        System.out.print("2) Interseccion");
        System.out.print("3) Diferencia");
        System.out.print("4) Diferencia simetrica");
        System.out.print("");
        System.out.print("Por favor digitar el numero de operacion deseada");
        int num1 = var.nextInt();
        System.out.print("Digite el la cantidad en el conjunto A:");
        int CardiA = var.nextInt();
        
        //lista A
        HashSet<Integer> listaA = new HashSet<>();
        for(int i = 0; i < CardiA; i++){
            System.out.print("Digite el numero:");
            int x = var.nextInt();
            listaA.add(x);
        }
            System.out.println("A = " + listaA);
            
         //Lista B
         System.out.print("Digite el la cantidad en el conjunto B:");
        int CardiB = var.nextInt();
        
        HashSet<Integer> listaB = new HashSet<>();
        for(int i = 0; i < CardiB; i++){
            System.out.print("Digite el numero:");
            int x = var.nextInt();
            listaB.add(x);
        }
            System.out.println("B = " + listaB);
            
     //Union
     HashSet<Integer> union = new HashSet <>();
     for (int elemento : listaA) {
         union.add(elemento);
     }
     for (int elemento : listaB) {
         union.add(elemento);
     }
     if(num1 == 1){
     System.out.println("Union = " + union);
     }
     //Interseccion
     HashSet<Integer> intersec = new HashSet <>();
     for (int elemento : listaA ){
         if(listaB.contains(elemento)){
         intersec.add(elemento);
         
     }
     }
     if(num1 == 2){
     System.out.println("Interseccion = " +intersec);
     }
     //Diferencia
     HashSet<Integer> dif = new HashSet <>();
     for (int elemento : listaA ){
         if(!listaB.contains(elemento)){
         dif.add(elemento);
         
     }
         
     }
     for (int elemento : listaB ){
         if(!listaA.contains(elemento)){
         dif.add(elemento);
         }
     }
     if(num1 == 3){
     System.out.println("Diferencia = " +dif);
     }
     //Diferencia Simetrica
     HashSet<Integer> difSim = new HashSet <>();
     for (int elemento : listaA) {
         if(!listaB.contains(elemento)){
         difSim.add(elemento);
     }
     }
     for (int elemento : listaB) {
         if(!listaA.contains(elemento)){
         difSim.add(elemento);
     }
     }
     if(num1 == 4){
     System.out.println("Diferencia Simetrica = " +difSim);
     }
    }
     
    }
    


