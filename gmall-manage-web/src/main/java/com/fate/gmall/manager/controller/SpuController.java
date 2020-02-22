package com.fate.gmall.manager.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.fate.gmall.bean.PmsProductInfo;
import com.fate.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class SpuController {

    @Reference
    SpuService spuService;

    @RequestMapping("spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String catalog3Id){

        List<PmsProductInfo> pmsProductInfos= spuService.spuList(catalog3Id);


        return pmsProductInfos;
    }

}