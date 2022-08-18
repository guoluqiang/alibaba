package com.guo.seataaccountservice2003.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guo.seataaccountservice2003.domain.Account;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

public interface AccountService extends IService<Account> {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
