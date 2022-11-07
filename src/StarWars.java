/*
* Desarrollar un pequeño videojuego educativo
* para adolescentes llamado 'Star Wars Códigos Secretos'
*/

import java.util.Scanner;

public class StarWars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== STAR WARS CÓDIGO SECRETOS ===");
        System.out.println("Hace mucho tiempo, en una galaxia muy, muy lejana... La Princesa Leia, Luke \n" +
                "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada \n" +
                "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio \n" +
                "está construyendo para destruirla. (Presiona Intro para continuar)");
        String intro = sc .nextLine();

        int S1, S2, total = 0;

        System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al \n" +
                "sistema S1 en el sector S2, pero el sistema de navegación está estropeado y el \n" +
                "computador tiene problemas para calcular parte de las coordenadas de salto. \n" +
                "Chewbacca, piloto experto, se da cuenta que falta el cuerto número de la serie. \n" +
                "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que \n" +
                "calcular el sumatorio entre nºdel sistema y el nºdel sector (ambos inclusive).\n" +
                "¿Qué debe introducir?");

        S1 = (int) (1 + Math.random() * (10 + 1));
        System.out.println("Nº del sistema " + S1);
        S2 = (int) (20 + Math.random() * (30 - 20 + 1));
        System.out.println("Nº del sector " + S2);

        if (S1 < S2) {
            for (int i = S1; i <= S2; i++) {
                total += i;
                System.out.print("+" + i );
            }
            System.out.println(" = " + total);
        }

        sc.close();
    }
}
