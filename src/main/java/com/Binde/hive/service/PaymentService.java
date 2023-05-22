package com.Binde.hive.service;

import com.Binde.hive.dto.request.FundWalletRequest;
import com.Binde.hive.dto.response.PayStackResponse;
import com.Binde.hive.dto.response.VerifyTransactionResponse;

import java.security.Principal;

public interface PaymentService {



    PayStackResponse initiatePaymentAndSaveToPaymentLog(FundWalletRequest taskerPaymentRequest, Principal principal) throws Exception;

    VerifyTransactionResponse verifyAndCompletePayment(String reference , Principal principal) throws Exception;


    VerifyTransactionResponse verifyAndCompletePayment(String reference) throws Exception;
}
