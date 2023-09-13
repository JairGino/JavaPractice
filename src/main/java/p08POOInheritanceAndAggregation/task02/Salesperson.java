package p08POOInheritanceAndAggregation.task02;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Salesperson extends Employee {
    private Integer totalSales;

    public Salesperson(String name, LocalDate dateOfBirth, String emailAddress, String phoneNumber, String jobTitle, BigDecimal salary, Integer totalSales) {
        super(name, dateOfBirth, emailAddress, phoneNumber, jobTitle, salary);
        this.totalSales = totalSales;
    }

    public Integer getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Integer totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public void view() {
        super.view();
        System.out.println(" totalSales= " + totalSales);
    }
}
