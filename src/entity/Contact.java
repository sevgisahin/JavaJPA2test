/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author ssahin
 */
@Entity
@Table(name="Contacts")
public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "OwnerId")
    private Person owner;
    @OneToOne
    @JoinColumn(name = "ContactId")
    private Person Contact;

    public Contact() {
    }

    public Contact(Person owner, Person contact) {
        this.owner = owner;
        this.Contact = contact;
    }

    public Contact(long id, Person owner, Person contact) {
        this(owner, contact);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getContact() {
        return Contact;
    }

    public void setContact(Person Contact) {
        this.Contact = Contact;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public int hashCode() {
        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Contacts[ id=" + id + " ]";
    }
}
