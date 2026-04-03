package com.benzodyne.ExpenseManager.repositories;

import com.benzodyne.ExpenseManager.entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Integer> {
}
