package com.example.warehouse.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Integer code;
    private Integer password;
    private boolean active;

    @ManyToMany
    @JoinTable(name = "user_warehouse", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "warehouse_id", referencedColumnName = "id"))
    private Set<Warehouse> warehouses;
}
