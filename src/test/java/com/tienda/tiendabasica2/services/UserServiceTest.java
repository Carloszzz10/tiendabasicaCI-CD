package com.tienda.tiendabasica2.services;

import com.tienda.tiendabasica2.modelo.User;
import com.tienda.tiendabasica2.service.Userservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles("test")
public class UserServiceTest {

    @Autowired
    private Userservice userService;

    @Test
    public void testSaveUser() {
        // Crear usuario
        User user = new User("Juan Pérez", "juan@email.com");

        // Guardar usuario
        User savedUser = userService.saveUser(user);

        // Verificar que se guardó correctamente
        assertNotNull(savedUser.getId());
        assertEquals("Juan Pérez", savedUser.getName());
        assertEquals("juan@email.com", savedUser.getEmail());
    }

    @Test
    public void testGetUserByEmail() {
        // Crear y guardar usuario
        User user = new User("Ana García", "ana@email.com");
        userService.saveUser(user);

        // Buscar por email
        User foundUser = userService.getUserByEmail("ana@email.com");

        // Verificar que se encontró
        assertNotNull(foundUser);
        assertEquals("Ana García", foundUser.getName());
    }
}