package cn.e3mall.service.impl;

import cn.e3mall.mapper.ItemMapper;
import cn.e3mall.pojo.Item;
import cn.e3mall.serivce.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemMapper itemMapper;

    @Override
    public Item selectById(long id) {
        System.out.println("service");
        return itemMapper.selectByPrimaryKey(id);
    }
}
