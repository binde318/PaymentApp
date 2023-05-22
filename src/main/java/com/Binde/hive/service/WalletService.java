package com.Binde.hive.service;


import com.Binde.hive.dto.response.TransactionResponse;
import com.Binde.hive.dto.response.WalletResponseDto;
import com.Binde.hive.entity.User;
import com.Binde.hive.entity.Task;
import com.Binde.hive.entity.Wallet;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.List;

public interface WalletService {



    boolean creditDoerWallet(User doer, BigDecimal creditAmount);

    WalletResponseDto getWalletByUser(Principal principal);

    void withdrawFromWalletBalance(User user, BigDecimal amount);

    boolean fundTaskerWallet(User tasker, BigDecimal amountToFund);

    boolean debitTaskerWalletToEscrow(Wallet wallet, BigDecimal amount);

    boolean refundTaskerFromEscrowWallet(Task taskToCancel);

    List<TransactionResponse> getWalletHistory(Principal principal);
}
