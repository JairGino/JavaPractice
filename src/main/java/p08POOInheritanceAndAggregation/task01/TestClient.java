package p08POOInheritanceAndAggregation.task01;

public class TestClient {
    public static void main(String[] args) {
        Client client1 = new PessoaFisica("John Doe", "johndoe@gmail.com", "(11)91111-1111", 22, "address1", "123.456.789-00");
        Client client2 = new PessoaFisica("Jane Smith", "janesmith@gmail.com", "(22)92222-2222", 25, "address2", "123.456.789-01");
        client1.view();
        client2.view();

        Client client3 = new PessoaJuridica("John Doe", "johndoe@gmail.com", "(11)91111-1111", 22, "address1", "12.345.678/0001-00");
        Client client4 = new PessoaJuridica("Jane Smith", "janesmith@gmail.com", "(22)92222-2222", 25, "address2", "12.345.678/0001-01");
        client3.view();
        client4.view();
    }
}
