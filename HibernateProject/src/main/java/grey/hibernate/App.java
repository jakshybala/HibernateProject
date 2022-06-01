package grey.hibernate;

import grey.hibernate.model.Item;
import grey.hibernate.model.Person;
import jakarta.persistence.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().addAnnotatedClass(Person.class)
                .addAnnotatedClass(Item.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        EntityManagerFactory entityManagerFactory = sessionFactory.unwrap(EntityManagerFactory.class);
        Session currentSession = sessionFactory.openSession();


        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Person person = new Person("Altysh", 12);
            List<Person> list = entityManager.createQuery("FROM Person").getResultList();
            System.out.println(list);
            List<Person> listp = entityManager.createQuery("FROM Person WHERE name like 'K%'").getResultList();
//            System.out.println(listp);

            entityManager.getTransaction().commit();
            entityManagerFactory.close();

        }finally {

        sessionFactory.close();

        }


    }
}

