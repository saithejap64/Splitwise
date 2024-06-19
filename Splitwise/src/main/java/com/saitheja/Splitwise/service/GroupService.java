package com.saitheja.Splitwise.service;

import com.saitheja.Splitwise.entity.SettlementTransaction;

import java.util.List;

public interface GroupService {
    List<SettlementTransaction> settleUp(int groupId);
}
