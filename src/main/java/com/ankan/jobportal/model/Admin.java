package com.ankan.jobportal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
@Document(collection = "admins")
public class Admin {
    
    @Id
    private String id;

    @NotBlank(message = "Name is required")
    @Size(min=3, max = 50)
    private String name;

    @NotBlank(message = "Email is required")
    @Size(min=5, max = 50)
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min=6, max = 100)
    private String password;
}
