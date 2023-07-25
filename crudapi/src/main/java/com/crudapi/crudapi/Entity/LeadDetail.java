package com.crudapi.crudapi.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="lead_detail")
@Data
public class LeadDetail {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_address")
    private String emailAddress;
    @Column(name = "phone_number")
    private String phoneNumber;
    @OneToMany(mappedBy = "leadDetail")
    private List<ConsultantDetail> consultantDetails;
}
