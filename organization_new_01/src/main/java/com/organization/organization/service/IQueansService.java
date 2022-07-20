package com.organization.organization.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.organization.organization.domain.Queans;

import org.springframework.stereotype.Service;

@Service
public interface IQueansService extends IService<Queans> {

    Object save();
}
