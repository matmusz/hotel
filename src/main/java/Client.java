import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Client  {

    private int clientId;
    private String name;
    private String surname;
    private int pesel;
    private static int HowManyClients=0;
    boolean isClientBooking=false;
    int counter;

    public Client() {
    }

    public Client(String name, String surname, int pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        HowManyClients++;
        this.clientId=HowManyClients;
    }

    @Override
    public String toString() {
        return
                "id='" + clientId + '\''+
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel=" + pesel +
                ", isClientBooking=" + isClientBooking +
                '}';
    }
}
