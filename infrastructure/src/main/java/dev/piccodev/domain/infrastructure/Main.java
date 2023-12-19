package dev.piccodev.domain.infrastructure;

/* Aqui teremos o ponto de entrada da aplicação Spring. */

import dev.piccodev.domain.application.UseCase;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(new UseCase().execute());
    }
}