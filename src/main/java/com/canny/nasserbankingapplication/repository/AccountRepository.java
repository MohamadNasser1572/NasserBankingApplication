package com.canny.nasserbankingapplication.repository;

import com.canny.nasserbankingapplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
