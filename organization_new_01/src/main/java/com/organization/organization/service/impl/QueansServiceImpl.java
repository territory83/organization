package com.organization.organization.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.organization.organization.domain.Queans;
import com.organization.organization.mapper.QueansMapper;
import com.organization.organization.service.IQueansService;

import org.springframework.stereotype.Service;



public class QueansServiceImpl extends ServiceImpl<QueansMapper,Queans> implements IQueansService {


//    @Autowired
//    private IQueansService queansService;
//
//    @Override
//    public Boolean save(Queans queans) {
//        return queansService.save(queans);
//    }
//
//    @Override
//    public Boolean update(Queans queans) {
//        return queansService.update(queans);
//    }
//
//    @Override
//    public Boolean delete(Integer id) {
//        return queansService.delect(id);
//    }
//
//    @Override
//    public Queans getById(Integer id) {
//        return queansService.getById(id);
//    }
//
//    @Override
//    public List<Queans> getAll() {
//        return queansService.getAll();
//    }
//
//    @Override
//    public IPage<Queans> getPage(int currentPage, int pageSize) {
//        return null;
//    }

}
