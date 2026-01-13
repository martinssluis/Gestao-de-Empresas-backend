package com.aceleradev.backend.config;

import com.aceleradev.backend.commons.enums.ProductCategory;
import com.aceleradev.backend.entities.Customer;
import com.aceleradev.backend.entities.Employee;
import com.aceleradev.backend.commons.enums.Role;
import com.aceleradev.backend.entities.Product;
import com.aceleradev.backend.repositories.CostumerRepository;
import com.aceleradev.backend.repositories.EmployeeRepository;
import com.aceleradev.backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.time.LocalDate;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CostumerRepository costumerRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception{
        Customer c1 = new Customer(null, "PC The One", "senha123", true, "12982228898",
                "pctheone@email.com", "00000000001", "O Melhorzin que tá tendo",
                LocalDate.now(), LocalDate.now());

        Employee e1 = new Employee(null, "Martins Luis", "senhaLuis123", true, "61982456789",
                "martinsluis@email.com","00000000001", "Garoto Prodigio",
                LocalDate.parse("2019-07-21"), Instant.now(),
                Role.MANAGER, 6500.00);

        Product mouse = new Product(
                null,
                "Mouse Logitech MX",
                299.90,
                ProductCategory.GAMES
        );

        costumerRepository.save(c1);
        employeeRepository.save(e1);
        productRepository.save(mouse);
        //employeeRepository.saveAll(List.of(e1));  List.of() no lugar de asList() pois temos apenas um parâmetro sendo passado
    }
}
