package com.foodDonationRegistry.fooddonationmanger.domain.food.controller;

import com.foodDonationRegistry.fooddonationmanger.domain.food.model.DonationType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class DonationController {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id;

        @NonNull
        private String firstName;

        @NonNull
        private String lastName;

        @NonNull
        private String email;

        @NonNull
        private String nameOFDonation;

        @NonNull
        private Donationtype donationtype;

        @NonNull
        private String description;

        @NonNull
        private Date date;

        @OneToMany
        private List<PerishableItems> pershables;
        @OneToMany
        private List<Non_perishableItems> pershables;


        public String toString() {
            return String.format("%d %s %s %s %s %s %s %s", id, firstName, lastName, email, nameOFDonation, DonationType donationtype, description, date);
        }
}
