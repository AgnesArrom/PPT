package PPT;

import java.util.Scanner;

public class PPTLS {

    public static void main(String args[]) {
        System.out.println("PEDRA - PAPER - TISORES - LLANGARDAIX - SPOCK");
        Scanner teclat = new Scanner(System.in);

        int maquina = (int) (Math.random() * 5) + 1;

        System.out.print("Elegeix la teva jugada [1]Pedra, [2]Paper, [3]Tisores, [4]Llangardaix, [5]Spock: ");
        int usuari = teclat.nextInt();

        System.out.print("La màquina ha elegit: ");
        switch (maquina) {
            case 1:
                System.out.println("Pedra");
                switch (usuari) {
                    case 1:
                        System.out.println("Empat!!");
                        break;
                    case 2:
                        System.out.println("Has guanyat!!");
                        break;
                    case 3:
                        System.out.println("La màquina ha guanyat!!");
                        break;
                    case 4:
                        System.out.println("La màquina ha guanyat!!");
                        break;
                    case 5:
                        System.out.println("Has guanyat!!");
                        break;
                }
                break;

            case 2:
                System.out.println("Paper");
                switch (usuari) {
                    case 1:
                        System.out.println("La màquina ha guanyat!!");
                        break;
                    case 2:
                        System.out.println("Empat!!");
                        break;
                    case 3:
                        System.out.println("Has guanyat!!");
                        break;
                    case 4:
                        System.out.println("Has guanyat!!");
                        break;
                    case 5:
                        System.out.println("La màquina ha guanyat!!");
                        break;
                }
                break;

            case 3:
                System.out.println("Tisores");
                switch (usuari) {
                    case 1:
                        System.out.println("Has guanyat!!");
                        break;
                    case 2:
                        System.out.println("La màquina ha guanyat!!");
                        break;
                    case 3:
                        System.out.println("Empat!!");
                        break;
                    case 4:
                        System.out.println("La màquina ha guanyat!!");
                        break;
                    case 5:
                        System.out.println("Has guanyat!!");
                        break;
                }
                break;

            case 4:
                System.out.println("Llangadaix");
                switch (usuari) {
                    case 1:
                        System.out.println("La màquina ha guanyat!!");
                        break;
                    case 2:
                        System.out.println("Has guanyat!!");
                        break;
                    case 3:
                        System.out.println("Has guanyat!!");
                        break;
                    case 4:
                        System.out.println("Empat!!");
                        break;
                    case 5:
                        System.out.println("La màquina ha guanyat!!");
                        break;
                }
                break;

            case 5:
                System.out.println("Spock");
                switch (usuari) {
                    case 1:
                        System.out.println("La màquina ha guanyat!!");
                        break;
                    case 2:
                        System.out.println("Has guanyat!!");
                        break;
                    case 3:
                        System.out.println("La màquina ha guanyat!!");
                        break;
                    case 4:
                        System.out.println("Has guanyat!!");
                        break;
                    case 5:
                        System.out.println("Empat!!");
                        break;
                }
                break;
        }
    }
}
