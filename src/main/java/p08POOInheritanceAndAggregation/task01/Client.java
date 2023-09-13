package p08POOInheritanceAndAggregation.task01;

public class Client {
    private String name;
    private String email;
    private String phoneNumber;
    private Integer age;
    private String address;

    public Client(String name, String email, String phoneNumber, Integer age, String address) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.address = address;
    }

    public void view() {
        System.out.println(
            "\nClient:" +
            "\n name= " + name  +
            "\n email= " + email  +
            "\n phoneNumber= " + phoneNumber +
            "\n age= " + age +
            "\n address= " + address
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
