package cn.e3mall.controller;

import cn.e3mall.pojo.Item;
import cn.e3mall.serivce.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/index")
    public String indexPage() {
        System.out.println("here");
        return "index1";
    }

    @RequestMapping("/item/{id}")
    @ResponseBody
    public Item selectById(@PathVariable Long id){
        Item item = itemService.selectById(id);
        return item;
    }
}