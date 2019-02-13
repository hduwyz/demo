package com.dc.demo.dao;

import com.dc.demo.domain.MarketFrStatV;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MarketFrStatVDao {


    MarketFrStatV getOne();
}
