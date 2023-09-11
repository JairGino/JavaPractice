package p07POOFuntamentals.task01;

public class TestClient {
    public static void main(String[] args) {
        Client client1 = new Client("John Doe", "johndoe@gmail.com", "(11)91111-1111", 22, "address1");
        Client client2 = new Client("Jane Smith", "janesmith@gmail.com", "(22)92222-2222", 25, "address2");

        client1.view();
        client2.view();
    }
}
