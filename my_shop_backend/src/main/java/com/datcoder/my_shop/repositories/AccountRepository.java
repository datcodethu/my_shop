package com.datcoder.my_shop.repositories;

import com.datcoder.my_shop.entity.auth.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}