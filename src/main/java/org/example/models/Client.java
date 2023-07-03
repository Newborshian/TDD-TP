package org.example.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Client {
    private Integer id;
    private String name;
    private String firstName;
    private String adress;
    private Integer zipCode;
    private String phoneNumber;

    public Client(String name, String firstName, String adress, Integer zipCode, String phoneNumber) {
        this.name = name;
        this.firstName = firstName;
        this.adress = adress;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    public Client(String name, String firstNames) {
        this.name = name;
        firstName = firstNames;
    }



    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", FirstName='" + firstName + '\'' +
                ", adress='" + adress + '\'' +
                ", zipCode=" + zipCode +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
