/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package con.mycompany.ahorcado;

import java.util.Scanner;
/**
 *
 * @author a17x_
 */
public class Ahorcado {

    public static void main(String[] args) {
        Scanner  entrada = new Scanner(System.in);
        boolean jugar = false;
        int error = 0;
        System.out.println("Bienvenido, con este programa podra jugar ahorcado!");
        do{
        Palabra juego = new Palabra();
        juego.iniciarJuego();
        while(error<6){
            System.out.println("Escriba su intento: ");
            String intento = entrada.next();
            error = juego.intento(intento,error);
            
        }
        juego.finalizar();
            System.out.println("Quieres volver a jugar?");
            char m = entrada.next().charAt(0);
            if(m=='s'||m=='S'){
            jugar = true;
            }
        }while(jugar==true);
    }
}
