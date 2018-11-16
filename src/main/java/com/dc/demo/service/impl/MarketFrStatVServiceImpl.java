package com.dc.demo.service.impl;

import com.dc.demo.dao.MarketFrStatVDao;
import com.dc.demo.domain.MarketFrStatV;
import com.dc.demo.service.MarketFrStatVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarketFrStatVServiceImpl implements MarketFrStatVService {

    @Autowired
    private MarketFrStatVDao marketFrStatVDao;

    @Override
    public MarketFrStatV getOne() {
        return marketFrStatVDao.getOne();
    }
}