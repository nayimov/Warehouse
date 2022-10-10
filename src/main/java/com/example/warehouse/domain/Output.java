package com.example.warehouse.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@NoArgsConstructor
@Entity
@AllArgsConstructor
@Getter
@Setter
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @ManyToOne
    private Warehouse warehouse;
    @ManyToOne
    private Currency currency;
    private Integer facture_number;
    private Integer code;
    @ManyToOne
    private Client client;

}
