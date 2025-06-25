package com.tienda.tiendabasica2.repository;

import com.tienda.tiendabasica2.modelo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Spring Data JPA ya nos da los métodos básicos como save, findAll, findById, etc.

    // Método personalizado para buscar por email
    User findByEmail(String email);
}