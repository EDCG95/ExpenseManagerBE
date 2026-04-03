package com.benzodyne.ExpenseManager.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.domain.Persistable;

import java.util.Date;
import java.util.Objects;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "wage")
public class Wage implements Persistable<Integer>, Comparable<Wage> {

    @Id
    @Column(insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "payment")
    Float payment;

    @Column(name = "payment_date")
    Date paymentDate;

    @Override
    public boolean isNew() {
        return Objects.isNull(id);
    }

    @Override
    public int compareTo(Wage o) {
        return this.paymentDate.compareTo(o.paymentDate);
    }
}
