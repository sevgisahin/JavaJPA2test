/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ssahin
 */
public class Test {

    private EntityManagerFactory emf;
    private EntityManager em;

    public Test() {
        emf = Persistence.createEntityManagerFactory("JavaJPA2testPU");
    }

    public void createNewUser(Person person) {
        System.out.println("User creation ");
        Person p1 = new Person("Sevgi");
        Person p2 = new Person("Sahin");
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(p1);
            em.persist(p2);
            p1.addContact(p2);
            em.persist(p1);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void deleteUserById(long id) {
        System.out.println("delete User");
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            Person user = em.find(entity.Person.class, id);
            em.remove(user);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public static void main(String args[]) {
//        Person p1 = new Person("Sevgi");
//        p1.setUserName("sevgi");
//        p1.setPassword("123456");
//        p1.setPhoneNumber("05447262889");
//        p1.setIsOnlıne(true);
//        p1.setCustomızedStatus("Hello world");
//        p1.setLastSeenOn(new Date());

//        Person p2 = new Person("Ali");
//        user2.setUserName("sevgi");
//        user2.setPassword("123456");
//        user2.setPhoneNumber("05447262889");
//        user2.setIsOnlıne(true);
//        user2.setCustomızedStatus("Hello world");
//        user2.setLastSeenOn(new Date());
//        Person p3 = new Person("Handan");

        Test test = new Test();

        test.deleteUserById((long)1);
//        test.createNewUser(null);
//        test.createNewUser(p2);
//        test.createNewUser(p3);

    }
}
