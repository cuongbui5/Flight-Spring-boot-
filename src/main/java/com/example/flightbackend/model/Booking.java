package com.example.flightbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "fare_id",referencedColumnName = "id")
    private Fare fare;
    @ManyToOne
    @JoinColumn(name = "contact_info_id",referencedColumnName = "id")
    private ContactInfo contactInfo;
    private LocalDateTime bookingDate;
    private boolean paymentStatus;
}
