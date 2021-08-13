/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.util.HashSet;

/**
 *
 * @author B14
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Lista A
        
        HashSet<Integer>  A = new HashSet <> ();
        for (int i = 3 ; i <= 20; i++){
            A.add(i);
        }
        System.out.println("Lista A:" + A);

                //Lista B
        HashSet<Integer>  B = new HashSet <> ();            
        for (int i = 2; i<28 ; i++ ){
            if(i % 2 == 0 ){
                B.add(i);
            }
            
    }
                System.out.println("lista B:"+ B);

                //Lista C
        HashSet<Integer> C = new HashSet<>(); 
                    C.add(1);
                    C.add(4);
                    C.add(7);
                    C.add(10);
                    C.add(14);
                    C.add(17);
                    C.add(20);
        System.out.println("Lista C : " + C);

        
         //LISTA D
         
        HashSet<Integer> D = new HashSet <> ();
                    D.add(2);
                    D.add(3);
                    D.add(5);
                    D.add(7);
                    D.add(11);
                    D.add(13);
                    D.add(17);
                    D.add(19);
                    D.add(23);
                    D.add(29);
                    D.add(31);
                    D.add(37);
                    D.add(41);
                    D.add(43);
                    
                   
            System.out.println("lista D:"+ D);
            
   //primera operacion
   HashSet<Integer> O1 = DifSim(interseccion(A, C), B);
   System.out.println("Operacion 1 " + O1);
   //interseccion
   HashSet<Integer> O2 = interseccion(union(C, A), D);
   System.out.println("Operacion 2 :" + O2);
   HashSet<Integer> O3 = union(A, DifSim(B, C));
   System.out.println("Operacion 3 :" + O3);
   HashSet<Integer> O4 = Diferencia(interseccion(A, D), DifSim(B, C));
   System.out.println("Operacion 4 :" + O4);
    }
    //Union
   public static HashSet<Integer> union(HashSet<Integer> c1, HashSet<Integer> c2){
        HashSet<Integer> resultado = new HashSet<>();
            resultado.addAll(c1);
            resultado.addAll(c2);
         return resultado;  
     
   }
    public static HashSet<Integer> interseccion(HashSet<Integer> c1, HashSet<Integer> c2){
        HashSet<Integer> resultado = new HashSet<>();
            for (int elemento : c1 ){
         if(c2.contains(elemento)){
        resultado.add(elemento);
         
         }
            }
           
         return resultado;  
     
    
   }
    
        public static HashSet<Integer> Diferencia(HashSet<Integer> c1, HashSet<Integer> c2){
        HashSet<Integer> resultado = new HashSet<>();
              for (int elemento : c1 ){
         if(!c2.contains(elemento)){
         resultado.add(elemento);
         
     }
         
     }
     for (int elemento : c2 ){
         if(!c1.contains(elemento)){
         resultado.add(elemento);
         }
     }
         return resultado;  
        
    
   }
        public static HashSet<Integer> DifSim(HashSet<Integer> c1, HashSet<Integer> c2){
        HashSet<Integer> resultado = Diferencia(union(c1,c2),interseccion(c1,c2));
            
         return resultado;  
     
    
   }


}
