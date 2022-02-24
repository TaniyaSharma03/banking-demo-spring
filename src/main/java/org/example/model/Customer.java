package org.example.model;

import javax.persistence.*;

@Entity(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;
    private String name;
    private String city;

private String date_of_birth;
private String zipcode;
private String status;
    public Customer(){}

//    public Customer(String id, String name, String city) {
//        this.id = id;
//        this.name = name;
//        this.city = city;
//    }

    public Long getId() {
        return id;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
