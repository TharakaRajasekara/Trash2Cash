package com.backend.friday_test.dto;



public class DeveloperDetailsDTO {

    private int id;

    private String name;

    private String address;

    private int telephone;

    public DeveloperDetailsDTO() {
    }

    public DeveloperDetailsDTO(int id, String name, String address, int telephone) {
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
        return "DeveloperDetailsDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone=" + telephone +
                '}';
    }
}
