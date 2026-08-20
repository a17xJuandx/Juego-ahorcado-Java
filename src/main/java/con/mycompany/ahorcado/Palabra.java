/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package con.mycompany.ahorcado;



/**
 *
 * @author a17x_
 */
import java.util.Random;

public class Palabra {
    String arr[] = {"paleta","muleta","papaya","madera","musica","tierra","cuidad","payaso","tesoro","pasear"};
    Random rand = new Random();
    String palabra1;
    String arr1[];
    String arr2[] ;

    public Palabra() {
        int num = rand.nextInt(arr.length);
    palabra1 = arr[num];

    arr1 = new String[palabra1.length()];
    arr2 = new String[palabra1.length()];
        }
    
    public void iniciarJuego(){
    for(int i=0; i<palabra1.length();i++){
        if(i+1<=palabra1.length()){
        arr1[i] = palabra1.substring(i,i+1);
        arr2[i] = "_";
        }
        }
}
    public int intento(String intento,int num){
        boolean acierto = false;
    for(int i=0; i<palabra1.length();i++){
        if(arr1[i].equals(intento)){
        arr2[i] = arr1[i];
        acierto = true;
        }
        System.out.print(arr2[i]);
        }
    if(acierto==false){
        num = num+1;
        System.out.println("");
        System.out.println("llevas "+num+" de 6 errores");
    }
    String nuevo = "";
    for(int i=0; i<palabra1.length();i++){
        nuevo = nuevo + arr2[i];
    }
    if(nuevo.equals(palabra1)){
        num = 6;
    }
    
        System.out.println("");
        return num;
    }
    
    public void finalizar(){
    String nuevo = "";
        System.out.println("Tu intento es: ");
    for(int i=0; i<palabra1.length();i++){
        nuevo = nuevo + arr2[i];
        System.out.print(arr2[i]);
    }
        System.out.println("");
    System.out.println("La palabra era: "+palabra1);
    if(nuevo.equals(palabra1)){
       
        System.out.println("Felicidades usted a ganado!!");
    }
    else {
        System.out.println("Intente mejor la proxima vez!");
    }
    }
   
   
}
