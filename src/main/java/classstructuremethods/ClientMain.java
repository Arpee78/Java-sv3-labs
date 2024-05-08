package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();
        client.setName("John Doe");
        client.setYear(1980);
        client.setAddress("New York");

        System.out.println("Név: " + client.getName());
        System.out.println("Születési év: " + client.getYear());
        System.out.println("Cím: " + client.getAddress());

        client.migrate("Los Angeles");
        System.out.println("Az új cím: " + client.getAddress());
    }
}
