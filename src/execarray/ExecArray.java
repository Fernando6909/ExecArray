/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execarray;

/**
 *
 * @author Fernando Alves
 */
public class ExecArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] n = {35,88,77,10,1,52,87,33,2,21,48,33};
        
        System.out.println("Encontre o maior valor: ");

        var maior = 0; 
        for(int i = 0; i < n.length;i++){
            if(n[i] > maior){
               maior = n[i];
            } 
          }
        System.out.println(maior);

        System.out.println("Encontre o menor valor e imprima:");
        var menor = 1;
        for (int i = 0; i < n.length; i++) {
            if(n[i] < menor){
                menor = n[i];
            } 
        }
        System.out.println(menor); 

        System.out.println("Retorne a media aritmetica e imprima:");
        float calculo = 0;
        int loop = 0;
        float result;
        for (int i = 0; i < n.length; i++) {
            calculo = calculo + n[i];
            loop = i;
        }
        result = calculo / loop;
        System.out.println(result);

        System.out.println("Imprima os numeros pares:");
        for (int i = 0; i < n.length; i++) {
            if(n[i]%2 == 0){
                System.out.println(n[i]);
            }
        }

        System.out.println("Imprima os numeros impares");
        for (int i = 0; i < n.length; i++) {
            if(n[i]%2 != 0){
                System.out.println(n[i]);
            }
        }
    }
}

    

