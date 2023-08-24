package com.expenseo.expenseo.controller;

import com.expenseo.expenseo.dto.ExpenseDTO;
import com.expenseo.expenseo.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/expense")
@CrossOrigin
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/saveExpense")
    public ExpenseDTO saveExpense(@RequestBody ExpenseDTO expenseDTO) {
        return expenseService.saveExpense(expenseDTO);
    }

    @PutMapping("/updateExpense")
    public ExpenseDTO updateExpense(@RequestBody ExpenseDTO expenseDTO) {
        return expenseService.updateExpense(expenseDTO);
    }

    @DeleteMapping("/deleteExpense")
    public boolean deleteExpense(@RequestBody ExpenseDTO expenseDTO) {
        return expenseService.deleteExpense(expenseDTO);
    }
}
