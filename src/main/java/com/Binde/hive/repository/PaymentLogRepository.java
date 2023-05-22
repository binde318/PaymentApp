package com.Binde.hive.repository;

import com.Binde.hive.entity.PaymentLog;
import com.Binde.hive.constant.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PaymentLogRepository extends JpaRepository<PaymentLog, String> {
    Optional<PaymentLog> findByTransactionReference(String reference);

    List<PaymentLog> findAllByTransactionStatus(TransactionStatus pending);
}