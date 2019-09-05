package com.example.filrouge.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name = "client")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nomClient;

    private String prenomClient;

    private String adresseClient;

    private String telephoneClient;

    private String emailClient;

    @OneToMany
    private Collection<Command> commands;


}
