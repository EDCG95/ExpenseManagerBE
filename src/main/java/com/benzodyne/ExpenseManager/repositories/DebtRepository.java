package com.benzodyne.ExpenseManager.repositories;

import com.benzodyne.ExpenseManager.entities.Debt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebtRepository extends JpaRepository<Debt, Integer> {
}
