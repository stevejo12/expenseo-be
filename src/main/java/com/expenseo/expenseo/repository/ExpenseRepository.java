package com.expenseo.expenseo.repository;

import com.expenseo.expenseo.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository <Expense, Integer> {

    @Query(
            nativeQuery = true,
            value =
            "SELECT * FROM expense WHERE userID = :userID")
    List<Expense> getExpensesByUserID(@Param("userID") int userID);
}
