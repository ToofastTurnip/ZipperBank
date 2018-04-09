package io.zipcoder.bank.model;

import io.zipcoder.core.model.BaseEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
public class Account extends BaseEntity {

    private static final Long serialVersionUID = 12345L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    // Put the account type here when we decide to store it as a string or enum

    @NotEmpty
    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name = "REWARDS")
    private Integer rewards;

    @Column(name = "BALANCE")
    private Double balance;

    // Noted out for now until we make the customer class
//    @Column(name = "CUSTOMER")
//    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getRewards() {
        return rewards;
    }

    public void setRewards(Integer rewards) {
        this.rewards = rewards;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
