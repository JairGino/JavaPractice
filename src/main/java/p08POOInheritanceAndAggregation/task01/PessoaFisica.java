package p08POOInheritanceAndAggregation.task01;

public class PessoaFisica extends Client {
    private String cpf;

    public PessoaFisica(String name, String email, String phoneNumber, Integer age, String address, String cpf) {
        super(name, email, phoneNumber, age, address);
        this.cpf = cpf;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("  cpf= " + cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
