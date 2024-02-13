package com.example.CodingChallenge.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees_details")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int id;

    @Column(name = "employee_name")
    private String name;

    @Column(name = "employee_address")
    private String address;

    @Column(name = "employee_department")
    private String department;

    @Column(name = "employee_email")
    private String email;
    @Column(name = "employee_contact_number")
    private int contact_number;

    public Employees(int id, String name, String address, String department, String email, int contact_number) {
    }

    public Employees() {

    }

    public void Employees() {
    }

    public void Employees(int id, String name, String address, String department, String email, int  contact_number) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.department = department;
        this.email = email;
        this.contact_number = contact_number;
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

    public String getDepartment() {
        return department;
    }
    public String getEmail() {
        return email;
    }
    public int getContact_number() {

        int Contact_number = Integer.parseInt(null);
        return Contact_number;
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
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setEmail(String email) {
        this.email= email;
    }

    public void setcontact_number(int contact_number) {
        this.contact_number = contact_number;
    }
    @Override
    public String toString() {
        return "Employees{" + "id=" + id + ", name='" + name + '\'' + ", address='" + address + '\'' + ", department='" + department + '\''+" , email='" +email+ '\'' + ", contact_number=" + contact_number +'}';
    }
}
