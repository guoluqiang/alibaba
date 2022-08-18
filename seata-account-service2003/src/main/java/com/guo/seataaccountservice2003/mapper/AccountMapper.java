package com.guo.seataaccountservice2003.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guo.seataaccountservice2003.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
