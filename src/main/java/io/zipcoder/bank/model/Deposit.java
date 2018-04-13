package io.zipcoder.bank.model;

import io.zipcoder.bank.enums.Medium;
import io.zipcoder.bank.enums.Status;
import io.zipcoder.bank.enums.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Deposit {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TYPE")
    private Type type;

    @Column(name = "TRANSACTION_DATE")
    private String transaction_date;

    @Column(name = "STATUS")
    private Status status;

    @Column(name = "PAYEE_ID")
    private Integer payee_id;

    @Column(name = "MEDIUM")
    private Medium medium;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "DESCRIPTION")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getPayee_id() {
        return payee_id;
    }

    public void setPayee_id(Integer payee_id) {
        this.payee_id = payee_id;
    }

    public Medium getMedium() {
        return this.medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
