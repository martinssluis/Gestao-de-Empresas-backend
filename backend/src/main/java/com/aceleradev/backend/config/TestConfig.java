package com.aceleradev.backend.config;

import com.aceleradev.backend.entities.Client;
import com.aceleradev.backend.entities.Employee;
import com.aceleradev.backend.entities.Payment;
import com.aceleradev.backend.entities.enums.Role;
import com.aceleradev.backend.repositories.ClientRepository;
import com.aceleradev.backend.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception{
        Client c1 = new Client(null, "Pc The One", "12982228898", "pctheone@email.com", "00000000001", "O Melhorzin que tá tendo", LocalDate.now());
        Client c2 = new Client(null, "Martins Luis", "61982456789", "martinsLuis@email.com", "00000000002", "Garoto Prodigio",LocalDate.now());
        Client c3 = new Client(null, "Dropp", "11987654321", "dropp@email.com", "00000000003", "O Brabo do React", LocalDate.now());

        Employee e1 = new Employee(null, "Random", "11984567121", "random@email.com", "senhaFuncionario", Role.VENDEDOR, 3700.00, "Nosso Latera", LocalDate.now(), null);

        clientRepository.saveAll(Arrays.asList(c1, c2, c3));
        employeeRepository.saveAll(List.of(e1)); // List.of() no lugar de asList() pois temos apenas um parâmetro sendo passado

    }
}
