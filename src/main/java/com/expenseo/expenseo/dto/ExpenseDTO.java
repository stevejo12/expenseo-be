package com.expenseo.expenseo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

enum ExpenseType {
    Income,
    Expense
}

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExpenseDTO {
    private int id;
    private String description;
    private Float amount;
    private Date date;
    private ExpenseType type;
    private int categoryID;
    private int userID;
}
