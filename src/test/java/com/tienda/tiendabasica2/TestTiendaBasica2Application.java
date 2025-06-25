package com.tienda.tiendabasica2;

import org.springframework.boot.SpringApplication;

public class TestTiendaBasica2Application {

    public static void main(String[] args) {
        SpringApplication.from(TiendaBasica2Application::main).with(TestcontainersConfiguration.class).run(args);
    }

}
