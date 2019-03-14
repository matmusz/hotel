import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        Hotel hotels = new Hotel();

        while (running) {
            menu();
            int choose = scan.nextInt();

            switch (choose) {
                case 1:
                    hotels.addClient();
                    break;

                case 2:
                    hotels.showClients();
                    break;

                case 3:
                    hotels.deleteClient();
                    break;

                case 4:
                    hotels.readFromFile();
                    break;

                case 5:
                    hotels.saveToFile();
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    break;
            }
        }
    }

    public static void menu() {

        System.out.println("1. Add client");
        System.out.println("2. Show list of clients");
        System.out.println("3. Delete client");
        System.out.println("1. Add client");
        System.out.println("1. Add client");
        System.out.println("1. Add client");

    }


}

