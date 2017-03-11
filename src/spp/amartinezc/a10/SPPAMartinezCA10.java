/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.a10;
import java.util.Scanner;
/**
 *
 * @author andres
 */
public class SPPAMartinezCA10 {

    /**
     * @param args the command line arguments
     */
    
   public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("Sumador, restador y multiplicador de 2 matrices");
    int[][] A, B, R = null;
    int n, m;
    
        
        n=solicitardato("\nIntroduce el ancho de las matrices");
        m=solicitardato("\nIntroduce el largo de las matrices");
    
        A=matriz(n,m,"A");
        B=matriz(n,m,"B");
        
        suma(n,m,A,B);
        resta(n,m,A,B);
        multiplicacionAxB(n,m,A,B);
        multiplicacionBxA(n,m,A,B);
    }
    
   public static int[][] matriz(int largo,int ancho,String nombre){
        int[][] matriz= new int[largo][ancho];
        Scanner kb= new Scanner(System.in);
            System.out.println("\nintroducir valores de la matriz "+nombre);
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++){ 
                        matriz[i][j]= solicitarentero();
                                         
     }
                   
  }
        return matriz;
}
   
   public static int solicitarentero(){
        Scanner kb= new Scanner(System.in);
        boolean flag;
        int n=0;
        do{
        try{
            n=kb.nextInt();
            flag=false;
            
        }catch (Exception ex) {
            System.out.println("Dato no válido, intenta nuevamente");
            flag=true;
            kb.next();
        }
    }while(flag);
    return n;
 }
   
   public static void suma(int largo, int ancho, int[][]A, int[][]B){
       int[][] R= new int[largo][ancho];
       System.out.println("\nSuma de las matrices A y B: \t");
       for (int i = 0; i < R.length; i++){
            for (int j = 0; j < R[i].length; j++){ 
                R[i][j]= A[i][j]+B[i][j];
                
                System.out.print(R[i][j]+" ");
     }
           System.out.println("");
  }
      
}   
   
   public static int solicitardato(String x){
       Scanner kb= new Scanner(System.in);
       int numero=0;
       boolean flag;
       do{
       System.out.println(x);
            try{
                numero=kb.nextInt();
                flag=true;
            } catch(Exception ex){
                flag=false;
                System.out.println("Dato no válido"+ex);
                kb.nextLine();
                  
            }
        }while(flag==false);
        return numero;
    } 
   
   public static void resta(int largo, int ancho, int[][]A, int[][]B){
       int[][] R= new int[largo][ancho];
       System.out.println("\nResta de las matrices A y B: \t");
       for (int i = 0; i < R.length; i++){
            for (int j = 0; j < R[i].length; j++){ 
                R[i][j]= A[i][j]-B[i][j];
                
                System.out.print(R[i][j]+" ");
     }
           System.out.println("");
   }
 } 
   
   public static void multiplicacionAxB(int largo, int ancho, int[][]A, int[][]B){
       int[][] R= new int[largo][ancho];
       System.out.println("\nMultiplicación de A x B: \t");
       for (int i = 0; i < A.length; i++){
            for (int j = 0; j < B[i].length; j++){ 
                for (int k = 0; k < R[j].length; k++) {
                    
                       R[i][j]=R[i][j]+ A[i][k]*B[k][j];      
                }
                System.out.print(R[i][j]+" ");
     }
           System.out.println("");
  }     
 } 
   
   public static void multiplicacionBxA(int largo, int ancho, int[][]A, int[][]B){
       int[][] R= new int[largo][ancho];
       System.out.println("\nMultiplicación de B x A: \t");
       for (int i = 0; i < A.length; i++){
            for (int j = 0; j < B[i].length; j++){ 
                for (int k = 0; k < R[j].length; k++) {
                    
                       R[i][j]=R[i][j]+ B[i][k]*A[k][j];      
                }
                System.out.print(R[i][j]+" ");
     }
           System.out.println("");
     }     
   }     
}
