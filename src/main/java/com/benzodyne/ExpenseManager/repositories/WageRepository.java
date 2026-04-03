package com.benzodyne.ExpenseManager.repositories;

import com.benzodyne.ExpenseManager.entities.Wage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WageRepository extends JpaRepository<Wage, Integer> {

}
