package org.example.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private Integer id;
    private String name;
    private String FirstName;
    private String adress;
    private Integer zipCode;
    private String phoneNumber;

    public Client(String name, String firstName, String adress, Integer zipCode, String phoneNumber) {
        this.name = name;
        FirstName = firstName;
        this.adress = adress;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", adress='" + adress + '\'' +
                ", zipCode=" + zipCode +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
