/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Entornos {

    //dshbcsdjhsfbyh
    public static boolean Pitagoras(int x, int y, int z) {
        boolean iguales = false;

        iguales = (Math.pow(x, 2) + Math.pow(y, 2)) == Math.pow(z, 2);

        return iguales;
    }
//dhfywehfhwfhweyfuyewgfyewfruwgfui
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int x, y, z;

        System.out.print("Introduce un número: ");
        x = entrada.nextInt();

        System.out.print("Introduce un número: ");
        y = entrada.nextInt();

        System.out.print("Introduce un número: ");
        z = entrada.nextInt();

        System.out.println("Son iguales?? :" + Pitagoras(x, y, z));
    }
}
