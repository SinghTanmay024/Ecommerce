package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "addresses")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    @Size(min = 5,message = "Street name must be atleast 5 letters")
    private String Street;

    @NotBlank
    @Size(min = 5,message = "Bulding name must be atleast 5 letters")
    private String buldingName;

    @NotBlank
    @Size(min = 4,message = "City name must be atleast 4 letters")
    private String city;

    @NotBlank
    @Size(min = 2,message = "State name must be atleast 5 letters")
    private String state;

    @NotBlank
    @Size(min = 2,message = "Country name must be atleast 2 letters")
    private String country;

    @NotBlank
    @Size(min = 6,message = "Pincode name must be atleast 6 letters")
    private String pincode;


    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Address(String street, String buldingName, String city, String state, String country, String pincode) {
        Street = street;
        this.buldingName = buldingName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}
