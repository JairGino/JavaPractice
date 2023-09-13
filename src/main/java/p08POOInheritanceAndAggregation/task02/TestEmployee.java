package p08POOInheritanceAndAggregation.task02;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Manager(
            "John Doe",
            LocalDate.of(1990, 5, 15),
            "johndoe@email.com",
            "(11) 91111-1111",
            "Software Engineer",
            new BigDecimal("4000.00"),
            "Department 01"
        );

        Employee employee2 = new Manager(
            "Jane Doe",
            LocalDate.of(2000, 8, 22),
            "jane.doe@email.com",
            "(11) 92222-2222",
            "Product Manager",
            new BigDecimal("6000.00"),
            "Department 02"
        );
        employee1.view();
        employee2.view();

        Employee employee3 = new Salesperson(
            "John Doe",
            LocalDate.of(1990, 5, 15),
            "johndoe@email.com",
            "(11) 91111-1111",
            "Software Engineer",
            new BigDecimal("4000.00"),
            5000
        );

        Employee employee4 = new Salesperson(
            "Jane Doe",
            LocalDate.of(2000, 8, 22),
            "jane.doe@email.com",
            "(11) 92222-2222",
            "Product Manager",
            new BigDecimal("6000.00"),
            7000
        );
        employee3.view();
        employee4.view();
    }
}
