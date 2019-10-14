package com.liuhongyin.mybatislearn.mapper;

import com.liuhongyin.mybatislearn.model.Country;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryMapper {

    public List<Country> findAll();

}
