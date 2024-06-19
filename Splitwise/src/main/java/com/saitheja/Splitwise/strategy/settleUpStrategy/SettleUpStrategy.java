package com.saitheja.Splitwise.strategy.settleUpStrategy;

import com.saitheja.Splitwise.entity.Expense;
import com.saitheja.Splitwise.entity.SettlementTransaction;

import java.util.List;

public interface SettleUpStrategy {
    List<SettlementTransaction> getSettlementTransactions(List<Expense> expenses);
}
