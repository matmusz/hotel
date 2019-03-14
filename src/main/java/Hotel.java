import lombok.Cleanup;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Hotel {

    ArrayList<Client> clients = new ArrayList<Client>();
    ArrayList<Room> rooms;

    public void addClient() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write name");
        String name = scan.nextLine();
        System.out.println("Write surname");
        String surname = scan.nextLine();
        System.out.println("Write PESEL");
        int pesel = scan.nextInt();


        Client client = new Client(name, surname, pesel);
        clients.add(client);

        System.out.println(client.toString());
    }

    public void showClients() {

        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).isClientBooking = false) ;
            System.out.println(clients.get(i).toString());
        }
    }

    public void deleteClient() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write surname to delete");
        String name = scan.nextLine();

        for (Iterator<Client> it = clients.iterator(); it.hasNext(); ) {
            Client tempo = it.next();
            if (tempo.getSurname().equals(name)) {
                it.remove();
            }
        }
    }

    public void readFromFile() {
        List<String> data = new ArrayList<String>();
        try {
            BufferedReader is = new BufferedReader(new FileReader("d://clients.txt"));
            while (is.ready()) {
                data.add(is.readLine());
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        data.forEach(temp -> System.out.println(temp));
        System.out.println("*************");

        for(String s : data){
            String [] splited;
            splited = s.split(";");
            int i = Integer.parseInt(splited[2]);
            Client client = new Client(splited[0],splited[1],i);
            clients.add(client);
        }




    }

    public void saveToFile() throws FileNotFoundException {

        try {
            @Cleanup PrintWriter out = new PrintWriter("d:/clients.txt");

            for (int i=0 ; i<clients.size() ; i++) {
                out.print(clients.get(i).getName());
                out.print(";");
                out.print(clients.get(i).getSurname());
                out.print(";");
                out.print(clients.get(i).getPesel());
                out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}





