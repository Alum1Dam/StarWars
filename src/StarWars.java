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
        //Nivel1
        int S1, S2, totalN1 = 0, sumatorioN1 = 0;
        //Nivel 2
        int P1, P2, totalN2 = 1, productorioN2 = 0;
        // Nivel 3
        int totalN3 = 0,factorialN3 = 1, contadorDelContador = 0;
        int N = 0;
        int[] contador;

        do {
            /*// Nivel 1
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
                    break;

                }
            }

            System.out.println("-------------------------");
            System.out.println("-------------------------");

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

            P1 = (int) (1 + Math.random() * (7));
            System.out.println("\nNº del agente " + P1);
            P2 = (int) (8 + Math.random() * (12 - 8 + 1));
            System.out.println("Nº de la nave " + P2 + "\n");

            if (P1 < P2) {
                for (int i = P1; i <= P2; i++) {
                    totalN2 *= i;
                    System.out.print("*" + i);
                }
                System.out.println();
                System.out.println("\n¿Cuál es el productorio entre P1 y P2? ");
                productorioN2 = sc.nextInt();
                if (productorioN2 == totalN2) {
                    System.out.println("Correcto !!");
                    System.out.println(totalN2);
                } else {
                    System.out.println("Has fallado la misión ಥ_ಥ ");
                    totalN2 = 0;
                    break;
                }
            }

            System.out.println("-------------------------");
            System.out.println("-------------------------");
*/
            // Nivel 3
            System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n" +
                    "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n" +
                    "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los N existentes se\n" +
                    "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n" +
                    "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n" +
                    "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n" +
                    "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10\n" +
                    "(redondeando N hacia abajo), donde N es el nº de niveles”.\n" +
                    "¿Cual es el nivel correcto?");

            N = (int) (50 + (Math.random() * 100));
            contador = new int[10];

            System.out.print((N/10) + "! =");
            if () {
                for (int i = 0; i < N; i--) {
                    factorialN3 = N * i;
                    factorialN3++;
                    System.out.println("* " + i);
                }
            } else {
                System.out.println("Has fallado la misión ಥ_ಥ ");
                totalN3 = 0;
                break;
            }


        } while (totalN1 != 0 || totalN2 != 0 || totalN3 != 0);

        System.out.println("Gracias por jugar :D");

        sc.close();
    }
}
