package p07POOFuntamentals.task02;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate dateOfBirth;
    private String emailAddress;
    private String phoneNumber;
    private String jobTitle;
    private BigDecimal salary;

    public Employee(String name, LocalDate dateOfBirth, String emailAddress, String phoneNumber, String jobTitle, BigDecimal salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void view() {
        System.out.println(
            "\nEmployee{" +
            "\n name= " + name +
            "\n dateOfBirth= " + dateOfBirth +
            "\n emailAddress= " + emailAddress +
            "\n phoneNumber= " + phoneNumber +
            "\n jobTitle= " + jobTitle +
            "\n salary= " + salary +
            '}'
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
