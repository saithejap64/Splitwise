package com.saitheja.Splitwise.strategy.settleUpStrategy;

import com.saitheja.Splitwise.entity.Expense;
import com.saitheja.Splitwise.entity.SettlementTransaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("bruteForceSettleUpStrategy")
public class BruteForceSettleUpStrategy implements SettleUpStrategy{

    @Override
    public List<SettlementTransaction> getSettlementTransactions(List<Expense> expenses) {
        return null;
    }
}
