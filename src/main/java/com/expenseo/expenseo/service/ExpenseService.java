package com.expenseo.expenseo.service;

import com.expenseo.expenseo.dto.ExpenseDTO;
import com.expenseo.expenseo.entity.Expense;
import com.expenseo.expenseo.repository.ExpenseRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ExpenseDTO saveExpense(ExpenseDTO expenseDTO) {
        expenseRepository.save(modelMapper.map(expenseDTO, Expense.class));
        return expenseDTO;
    }

    public ExpenseDTO updateExpense(ExpenseDTO expenseDTO) {
        expenseRepository.save(modelMapper.map(expenseDTO, Expense.class));
        return expenseDTO;
    }

    public boolean deleteExpense(ExpenseDTO expenseDTO) {
        expenseRepository.delete(modelMapper.map(expenseDTO, Expense.class));
        return true;
    }
}
