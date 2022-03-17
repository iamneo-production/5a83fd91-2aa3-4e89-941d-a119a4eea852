package com.examly.springapp.model;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dto {
    private Long id;
    private String email;
    private String username;
    private String mobileNumber;
    
    //additional
    private boolean active;
}