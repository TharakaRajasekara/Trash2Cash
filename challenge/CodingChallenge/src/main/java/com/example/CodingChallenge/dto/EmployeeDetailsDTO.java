
package com.example.CodingChallenge.dto;


public class EmployeeDetailsDTO {

    private int id;

    private String name;

    private String address;

    private String department;

    private String email;

    private int contact_number;

    public EmployeeDetailsDTO() {
    }

    public EmployeeDetailsDTO(int id, String name, String address,String departments,String email, int contact_number) {
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

    public int getcontact_number() {
        return contact_number;
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
        this.email = email;
    }

    public void setcontact_number(int contact_numbere) {
        this.contact_number = contact_numbere;
    }

    @Override
    public String toString() {
        int Contact_number;
        return "DeveloperDetailsDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ",department=' " +department + '\'' +
                ", email='" + email + '\'' +
                ", contact_number=" + contact_number+
                '}';
    }

    public int getContact_number() {
        return 0;
    }
}
