package com.expenseo.expenseo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

enum ExpenseType {
    Income,
    Expense
}

@Entity
@Table(name = "expense")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Expense {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "description")
    private String description;
    @Column(name = "amount")
    private Float amount;
    @Column(name = "date")
    private Date date;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ExpenseType type;
    @Column(name = "categoryID")
    private int categoryID;
    @Column(name = "userID")
    private int userID;
}
