/*
* Desarrollar un pequeño videojuego educativo
* para adolescentes llamado 'Star Wars Códigos Secretos'
*/

import java.util.Scanner;

public class StarWars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Inicio del Programa
        System.out.println("=== STAR WARS CÓDIGO SECRETOS ===");
        System.out.println("Hace mucho tiempo, en una galaxia muy, muy lejana... La Princesa Leia, Luke \n" +
                "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada \n" +
                "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio \n" +
                "está construyendo para destruirla. (Presiona Intro para continuar)");
        String intro = sc .nextLine();

        //Declaración de variables
        int S1, S2, totalN1 = 0, sumatorioN1 = 0;

        do {
            // Nivel 1
            System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al \n" +
                    "sistema S1 en el sector S2, pero el sistema de navegación está estropeado y el \n" +
                    "computador tiene problemas para calcular parte de las coordenadas de salto. \n" +
                    "Chewbacca, piloto experto, se da cuenta que falta el cuerto número de la serie. \n" +
                    "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que \n" +
                    "calcular el sumatorio entre nºdel sistema y el nºdel sector (ambos inclusive).\n" +
                    "¿Qué debe introducir?");
            //Una numeración random de S1(1 al 10) y el S2 (20 al 30)
            S1 = (int) (1 + Math.random() * (10 + 1));
            System.out.println("\nNº del sistema " + S1);
            S2 = (int) (20 + Math.random() * (30 - 20 + 1));
            System.out.println("Nº del sector " + S2 + "\n");

            if (S1 < S2) {

                for (int i = S1; i <= S2; i++) {

                    totalN1 += i;
                    System.out.print("+" + i);

                }
                System.out.println();
                System.out.println("\n¿Cuál es el sumatorio desde S1 hasta S2? ");
                sumatorioN1 = sc.nextInt();
                if (sumatorioN1 == totalN1) {
                    System.out.println("Correcto !!");
                    System.out.println(totalN1);
                } else {
                    System.out.println("Has fallado la misión ಥ_ಥ ");
                    totalN1 = 0;
                }
            }

            System.out.println("-------------------------");
            System.out.println("------------------------");
            System.out.println("-----------------------");
            System.out.println("----------------------");
            // Nivel 2

            System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n" +
                    "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n" +
                    "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí agente\n" +
                    "de espaciopuerto P1 contactando con nave imperial P2. No están destinados en este\n" +
                    "sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. “Eh… tenemos\n" +
                    "un fallo en el… eh… condensador de fluzo... Solicitamos permiso para atracar y\n" +
                    "reparar la nave”. El agente, que no se anda con tonterías, responde “Proporcione\n" +
                    "código de acceso o abriremos fuego”. Han Solo ojea rápidamente el manual del piloto\n" +
                    "que estaba en la guantera y da con la página correcta. El código es el productorio\n" +
                    "entre el nº del agente y el nº de la nave (ambos inclusive).\n" +
                    "¿Cuál es el código?");






        } while (totalN1 != 0);

        System.out.println("Gracias por jugar :D");

        sc.close();
    }
}
