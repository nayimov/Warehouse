package com.example.warehouse.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Notification implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="message")
    private String message;

    @Column(name = "isRead")
    private boolean isRead;

//    @Column(name = "createdAt")
//    private String createdAt;

    @ManyToOne
    private User user;
}
