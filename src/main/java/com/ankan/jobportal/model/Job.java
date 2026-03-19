package com.ankan.jobportal.model;

// For auto increment
import org.springframework.data.annotation.Id;

// To specify collection name
import org.springframework.data.mongodb.core.mapping.Document;

// NotBlank and Size for validation
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// For code size reducing
import lombok.Data;

@Data
@Document(collection = "jobs")
public class Job {
    @Id
    private String id; // Represents MongoDB Primary Key

    @NotBlank(message = "Title is required")
    @Size(min=3, max = 10)
    private String title;

    @NotBlank(message = "Company name is required")
    @Size(min=3, max = 50)
    private String company;

    @Size(min=50, max = 500)
    private String description;

    @NotBlank(message = "Location is required")
    @Size(min=3, max = 30)
    private String location;
}
