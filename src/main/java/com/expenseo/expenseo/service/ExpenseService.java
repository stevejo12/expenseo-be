package com.expenseo.expenseo.service;

import com.expenseo.expenseo.dto.ExpenseDTO;
import com.expenseo.expenseo.entity.Expense;
import com.expenseo.expenseo.repository.ExpenseRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private ModelMapper modelMapper;
    public ResponseEntity<List<Expense>> getAllUserExpenses(int userID) {
        return new ResponseEntity<>(expenseRepository.getExpensesByUserID(userID), HttpStatus.OK);
    }

    public ExpenseDTO getExpenseByID(int id) {
        Optional<Expense> userExpense = expenseRepository.findById(id);
        ExpenseDTO expenseDTO = modelMapper.map(userExpense, ExpenseDTO.class);
        return expenseDTO;
    }

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
