package com.prabhjot.java.hibernate.introduction.src.main.java.org.prabhjot;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Prabhjot Singh");
        st.setSid(10293);
        st.setMarks(87.9);

        //requires a file hibernate.cfg.xml
//        Configuration configuration = new Configuration();
//        configuration.addAnnotatedClass(org.prabhjot.Student.class);
//        configuration.configure();

        //session is interface, required session factory.
        SessionFactory sessionFactory =
                new Configuration()
                        .addAnnotatedClass(Student.class)
                        .configure()
                        .buildSessionFactory();

        Session session = sessionFactory.openSession();

        //Crete a Transaction and then commit.
//        Transaction transaction = session.beginTransaction();
//
//        session.persist(st);
//
//        transaction.commit();

        //adding one more student in the relation.
//        Student st2 = new Student();
//        st2.setSid(10229);
//        st2.setMarks(77.74);
//        st2.setName("Shiva");

//        Transaction transaction1 = session.beginTransaction();
//        session.persist(st2);
//        transaction1.commit();

        //uses- Eager Fetching -> fetch even if not used.
//        Student me = session.get(Student.class, 10293);
//        System.out.println(me.toString());

//        Student me = session.find(Student.class, 10293);
//        System.out.println(me);

//        Student me = session.byId(Student.class).load(10293);
//        System.out.println(me);

        //uses lazy loading - does fire the query if object not used.
        Student me = session.byId(Student.class).getReference(10293);
//        System.out.println(me);

        session.close();
        sessionFactory.close();

    }
}