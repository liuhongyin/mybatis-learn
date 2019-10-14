package com.liuhongyin.mybatislearn.service.impl;

import com.liuhongyin.mybatislearn.mapper.CountryMapper;
import com.liuhongyin.mybatislearn.model.Country;
import com.liuhongyin.mybatislearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryMapper countryMapper;

    @Override
    public List<Country> findAll() {
        return countryMapper.findAll();
    }
}
