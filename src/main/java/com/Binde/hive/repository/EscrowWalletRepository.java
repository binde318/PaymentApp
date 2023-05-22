package com.Binde.hive.repository;

import com.Binde.hive.entity.EscrowWallet;
import com.Binde.hive.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscrowWalletRepository extends JpaRepository<EscrowWallet, String > {
    void deleteByTask(Task task);
}
