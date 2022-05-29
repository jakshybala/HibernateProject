package grey.sprinPractice;

import jakarta.persistence.EntityManager;

/*
grey.sprinPractice
Tarih: 12.05.2022, Saat: 12:02, Author: Grey 
*/
public class Repository <T> {
    private EntityManager entityManager;

    public void save(T object) {
        entityManager.getTransaction().begin();


        entityManager.persist(object);
        entityManager.getTransaction().commit();



    }
    public Boolean isEntity(Class<?> object) {
        for
    }

}
