package org.example;


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Basic CRUD operations khud mil jayenge
}