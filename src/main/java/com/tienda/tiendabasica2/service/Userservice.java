package com.tienda.tiendabasica2.service;

import com.tienda.tiendabasica2.modelo.User;
import com.tienda.tiendabasica2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


@Service
public class Userservice {

    @Autowired
    private UserRepository userRepository;

    // Obtener todos los usuarios
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Guardar un usuario
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Buscar usuario por ID
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Buscar usuario por email
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}