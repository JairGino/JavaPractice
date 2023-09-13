package p08POOInheritanceAndAggregation.task02;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Manager extends Employee{
    private String department;

    public Manager(String name, LocalDate dateOfBirth, String emailAddress, String phoneNumber, String jobTitle, BigDecimal salary, String department) {
        super(name, dateOfBirth, emailAddress, phoneNumber, jobTitle, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public void view() {
        super.view();
        System.out.println(" department= " + department);
    }
}
