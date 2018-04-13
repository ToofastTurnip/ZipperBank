package io.zipcoder.bank.model;


import io.zipcoder.bank.enums.Medium;
import io.zipcoder.bank.enums.Status;
import io.zipcoder.bank.enums.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Withdrawal {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TYPE")
    private Type type;

    @Column(name = "TRANSACTION_DATE")
    private String transaction_date;

    @Column(name = "STATUS")
    private Status status;

    @Column(name = "PAYER_ID")
    private Integer payer_id;

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
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getPayer_id() {
        return payer_id;
    }

    public void setPayer_id(Integer payer_id) {
        this.payer_id = payer_id;
    }

    public Medium getMedium() {
        return medium;
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
