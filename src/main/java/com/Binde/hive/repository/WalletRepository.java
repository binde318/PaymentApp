package com.Binde.hive.repository;

import com.Binde.hive.entity.User;
import com.Binde.hive.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, String> {

    Optional<Wallet> findByUser(User user);

}
