package com.jonghyeon.redis.account;

import com.jonghyeon.redis.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, String> {
}
