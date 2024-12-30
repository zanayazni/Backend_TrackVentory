package com.example.db_barang.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db_barang.model.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {
}
