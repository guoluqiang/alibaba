package com.guo.seatastorageservice2002.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guo.seatastorageservice2002.domain.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageMapper extends BaseMapper<Storage> {
    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
