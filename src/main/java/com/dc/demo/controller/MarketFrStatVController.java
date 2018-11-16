package com.dc.demo.controller;

import com.dc.demo.domain.MarketFrStatV;
import com.dc.demo.service.MarketFrStatVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MarketFrStatVController {

    @Autowired
    MarketFrStatVService marketFrStatVService;

    @RequestMapping(value = "/get", produces = "application/json", method = RequestMethod.GET)
    public MarketFrStatV getOne(){
        return marketFrStatVService.getOne();
    }

}