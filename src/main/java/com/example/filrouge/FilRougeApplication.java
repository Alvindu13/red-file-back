package com.example.filrouge;

import com.example.filrouge.entities.Command;
import com.example.filrouge.entities.Customer;
import com.example.filrouge.repositories.CommandRepository;
import com.example.filrouge.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class FilRougeApplication implements CommandLineRunner {

    private CustomerRepository repoCust;
    private CommandRepository repoCmd;
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public FilRougeApplication(CustomerRepository repoCust, CommandRepository repoCmd) {
        this.repoCust = repoCust;
        this.repoCmd = repoCmd;
    }

    public static void main(String[] args) {
        SpringApplication.run(FilRougeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repositoryRestConfiguration.exposeIdsFor(Command.class);
        repositoryRestConfiguration.exposeIdsFor(Customer.class);

        repoCmd.save(
                new Command(
                        null, LocalDate.now(), 2000.00,
                        "espèce", "payée",
                        "express", "en cours de préparation"
                ));

        repoCmd.save(
                new Command(
                        null, LocalDate.now(), 2000.00,
                        "espèce", "payée",
                        "express", "en cours de préparation"
                ));

        repoCust.save(
                new Customer(
                        null, "Jacques",
                        "François", "Paris, 20 T",
                        "0432344332", "test@test.com", repoCmd.findAll()
                ));

        repoCust.save(
                new Customer(
                        null, "Rustine",
                        "François", "Paris, 20 T",
                        "0432344332", "test@test.com", null
                ));
    }
}
