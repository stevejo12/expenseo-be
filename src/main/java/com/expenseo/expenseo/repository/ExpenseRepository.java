package com.expenseo.expenseo.repository;

import com.expenseo.expenseo.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository <Expense, Integer> {
}
