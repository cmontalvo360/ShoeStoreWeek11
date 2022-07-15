package com.example.Getapi2.model;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customers1 {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id=0;

    String Lastname="";
    String firstname="";
    String customeraddress ="";
    String customeremail ="";

   String customerphone="";

    Customers1()
    {

    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public String getEmailaddress() {
        return customeremail;
    }

    public void setEmailaddress(String emailaddress) {
        this.customeremail = emailaddress;
    }

    public String getPhonenumber() {
        return customerphone;
    }

    public void setPhonenumber(String phonenumber) {
        this.customerphone = phonenumber;
    }

    public int getUid() {
        return id;
    }

    @Override
    public String toString() {
        return "Customers1 [uid=" + id + ", lastname=" + Lastname + ", firstname=" + firstname + ", address="
                + customeraddress + ", emailaddress=" + customeremail + ", phonenumber=" + customerphone + "]";
    }

    public Customers1( String lastname, String firstname, String address, String emailaddress,
                       String phonenumber) {
        super();

        this.Lastname = lastname;
        this.firstname = firstname;
        this.customeraddress = address;
        this.customeremail = emailaddress;
        this.customerphone = phonenumber;
    }

}
