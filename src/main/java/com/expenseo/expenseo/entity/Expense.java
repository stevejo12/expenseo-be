package com.expenseo.expenseo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Expense {
    @Id
    private int id;
    private String description;
    private Number amount;
    private Date date;
    private String category;
    private String categoryLogo;
}
