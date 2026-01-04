package org.example;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data // Isse getters/setters khud ban jayenge
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String role; // ADMIN ya STUDENT
}