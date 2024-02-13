package com.backend.friday_test.entity;

import javax.persistence.*;

@Entity
@Table(name = "developer_details")
public class Developers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "developer_id")
    private int id;

    @Column(name = "developer_name")
    private String name;

    @Column(name = "developer_address")
    private String address;

    @Column(name = "developer_contact")
    private int telephone;

    public Developers() {
    }

    public Developers(int id, String name, String address, int telephone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Developers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone=" + telephone +
                '}';
    }

}
