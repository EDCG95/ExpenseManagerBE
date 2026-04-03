package com.benzodyne.ExpenseManager.repositories;

import com.benzodyne.ExpenseManager.entities.Debt;
import com.benzodyne.ExpenseManager.entities.DebtType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebtTypeRepository extends JpaRepository<DebtType, String> {
}
