package com.saitheja.Splitwise.strategy.settleUpStrategy;

import com.saitheja.Splitwise.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
    private User from;
    private User to;
    private Integer amount;
}
