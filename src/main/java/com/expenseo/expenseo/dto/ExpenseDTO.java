package com.expenseo.expenseo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExpenseDTO {
    private int id;
    private String description;
    private Number amount;
    private Date date;
    private String category;
    private String categoryLogo;
}
