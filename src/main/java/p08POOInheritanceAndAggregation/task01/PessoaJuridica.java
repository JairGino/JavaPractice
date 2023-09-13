package p08POOInheritanceAndAggregation.task01;

public class PessoaJuridica extends Client {
    private String cnpj;

    public PessoaJuridica(String name, String email, String phoneNumber, Integer age, String address, String cnpj) {
        super(name, email, phoneNumber, age, address);
        this.cnpj = cnpj;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("  cnpj= " + cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
