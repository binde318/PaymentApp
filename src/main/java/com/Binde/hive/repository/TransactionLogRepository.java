package com.Binde.hive.repository;

import com.Binde.hive.entity.TransactionLog;
import com.Binde.hive.entity.User;
import com.Binde.hive.constant.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionLogRepository extends JpaRepository<TransactionLog, String> {
    List<TransactionLog> findAllByUserAndTransactionStatus(User user, TransactionStatus transactionStatus);
}
