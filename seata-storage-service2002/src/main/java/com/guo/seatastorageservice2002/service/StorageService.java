package com.guo.seatastorageservice2002.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guo.seatastorageservice2002.domain.Storage;

public interface StorageService extends IService<Storage> {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
