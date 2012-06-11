package entity;

import entity.Contact;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-05-30T16:38:55")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, Long> id;
    public static volatile SingularAttribute<Person, String> phoneNumber;
    public static volatile SingularAttribute<Person, String> userName;
    public static volatile SingularAttribute<Person, String> lastSeenOn;
    public static volatile SingularAttribute<Person, String> customizedStatus;
    public static volatile SingularAttribute<Person, String> password;
    public static volatile ListAttribute<Person, Contact> contacts;

}