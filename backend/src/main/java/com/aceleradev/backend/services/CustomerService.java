package com.aceleradev.backend.services;

import com.aceleradev.backend.commons.dto.CreateCustomerDto;
import com.aceleradev.backend.commons.dto.GetCustomerDto;
import com.aceleradev.backend.commons.dto.UpdateCustomerDto;
import com.aceleradev.backend.entities.Customer;
import com.aceleradev.backend.repositories.CustomerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<GetCustomerDto> findAll() {
        List<Customer> customers = repository.findAll();
        return customers
                .stream()
                .map(c -> {
                            GetCustomerDto customerDto = new GetCustomerDto();
                            customerDto.setName(c.getName());
                            customerDto.setDescription(c.getDescription());
                            customerDto.setActive(c.getActive());
                            customerDto.setEmail(c.getEmail());
                            customerDto.setPhoneNumber(c.getPhoneNumber());
                            customerDto.setCreatedAt(c.getCreatedAt());
                            return customerDto;
                        }
                ).toList();
    }

    public GetCustomerDto findById(Long id) {
        GetCustomerDto customerDto = new GetCustomerDto();
        Customer customerRepository = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Costumer not found"));

        customerDto.setName(customerRepository.getName());
        customerDto.setDescription(customerRepository.getDescription());
        customerDto.setActive(customerRepository.getActive());
        customerDto.setEmail(customerRepository.getEmail());
        customerDto.setPhoneNumber(customerRepository.getPhoneNumber());
        customerDto.setCreatedAt(customerRepository.getCreatedAt());

        return customerDto;
    }

    public Customer createCustomer(CreateCustomerDto customerDto) {
        Customer customerEntity = new Customer();
        // UUID defineIdentifier = UUID.randomUUID();

        customerEntity.setName(customerDto.getName());
        customerEntity.setPassword(customerDto.getPassword());
        customerEntity.setActive(customerDto.getActive());
        customerEntity.setCreatedAt(LocalDate.now());
        customerEntity.setPhoneNumber(customerDto.getPhoneNumber());
        customerEntity.setEmail(customerDto.getEmail());
        customerEntity.setDescription(customerDto.getDescription());
        // customerEntity.setIdentifier(defineIdentifier.toString());

        //TODO: Fazer mapeamento entre de Entity para DTO para TODOS OS FLUXOS INBOUND(de fora pra dentro)

        return repository.save(customerEntity);
    }

        public Customer updateCustomer(Long id, UpdateCustomerDto customerDto) {

            // 1. Pegar id
            Optional<Customer> optionalCustomer = repository.findById(id);

            // 2. Setar informações
            if (optionalCustomer.isPresent()) {
                Customer customer = optionalCustomer.get();
                customer.setName(customerDto.getName());
                customer.setActive(customerDto.getActive());
                customer.setPhoneNumber(customerDto.getPhoneNumber());
                customer.setEmail(customerDto.getEmail());
                customer.setDescription(customerDto.getDescription());

                return repository.save(customer);
            } else {
                throw new RuntimeException("Customer not found");
            }

        }
}
