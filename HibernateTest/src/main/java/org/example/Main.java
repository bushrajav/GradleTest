package org.example;

import jakarta.persistence.*;
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        House firstHouse = entityManager.find(House.class, 1);
        System.out.println(firstHouse);

    }
}
