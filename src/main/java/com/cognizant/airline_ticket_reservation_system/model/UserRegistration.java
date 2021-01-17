package com.cognizant.airline_ticket_reservation_system.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Component
public class UserRegistration {
    @NotBlank(message = "error.user.name")
    private String name;
    @NotBlank(message = "error.password")
    @Size(min = 6, message = "error.user.password.length")
    @Pattern(regexp = "^.+$", message = "error.user.password.specialCharacter")
    private String password;
    @NotBlank(message = "error.user.confirmPassword")
    private String confirmPassword;
    @Email(message = "error.user.email")
    private String email;
    @NotBlank(message = "error.user.address")
    private String address;
    @NotBlank(message = "error.user.phone")
    @Pattern(regexp = "^(\\d{10})?$", message = "error.user.phone.invalid")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
