package p07POOFuntamentals.task02;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(
            "John Doe",
            LocalDate.of(1990, 5, 15),
            "johndoe@email.com",
            "(11) 91111-1111",
            "Software Engineer",
            new BigDecimal("4000.00")
        );

        Employee employee2 = new Employee(
            "Jane Doe",
            LocalDate.of(2000, 8, 22),
            "jane.doe@email.com",
            "(11) 92222-2222",
            "Product Manager",
            new BigDecimal("6000.00")
        );

        employee1.view();
        employee2.view();
    }
}
