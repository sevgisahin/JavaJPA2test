/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author ssahin
 */
@Entity
@Table(name = "People")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //test git diff
    private String userName;
    private String password;
    private String phoneNumber;
    private String lastSeenOn;
    private String customizedStatus;
    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER, cascade = {CascadeType.ALL},orphanRemoval=true)
    private List<Contact> contacts = new ArrayList<Contact>();


    public Person() {
//        this.contacts = new ArrayList<Contact>();
//        this.files = new ArrayList<File>();
//        this.messages = new ArrayList<Message>();
    }

    public Person(String userName) {
        this.userName = userName;
//        this.contacts = new ArrayList<Contact>();
//        this.files = new ArrayList<File>();
//        this.messages = new ArrayList<Message>();

    }

    public Person(long id, String userName) {
        this.userName = userName;
//        this.contacts = new ArrayList<Contact>();
//        this.files = new ArrayList<File>();
//        this.messages = new ArrayList<Message>();
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomizedStatus() {
        return customizedStatus;
    }

    public void setCustomizedStatus(String customizedStatus) {
        this.customizedStatus = customizedStatus;
    }

    public String getLastSeenOn() {
        return lastSeenOn;
    }

    public void setLastSeenOn(String lastSeenOn) {
        this.lastSeenOn = lastSeenOn;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Person person) {
        Contact c = new Contact(this, person);
        contacts.add(c);
    }


//    public Collection<Contact> getContacts() {
//        if (contacts == null) {
//            contacts = new ArrayList<Contact>();
//        }
//        return contacts;
//    }
//
//    public void setContacts(Collection<Contact> contacts) {
//        this.contacts = contacts;
//    }
    @Override
    public int hashCode() {
        int hash = 0;
        //hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Users[ id=" + id + " ]";
    }
}
