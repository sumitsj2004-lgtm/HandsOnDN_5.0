package com.sumit.springdatajpa.entity;

import jakarta.persistence.*;

@Entity
public class StudentIdCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cardNumber;
    private String issueDate;

    public StudentIdCard() {}

    public StudentIdCard(Long id, String cardNumber, String issueDate) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getCardNumber() {return cardNumber;}
    public void setCardNumber(String cardNumber) {this.cardNumber = cardNumber;}

    public String getIssueDate() {return issueDate;}
    public void setIssueDate(String issueDate) {this.issueDate = issueDate;}
}
