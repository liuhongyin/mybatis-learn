package com.liuhongyin.mybatislearn.controller;

import com.liuhongyin.mybatislearn.mapper.CountryMapper;
import com.liuhongyin.mybatislearn.model.Country;
import com.liuhongyin.mybatislearn.service.CountryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "国家管理")
@RequestMapping("/countrys")
@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    @ApiOperation(value = "获取国家列表")
    public List<Country> getCountryList() {
        return countryService.findAll();
    }

}
