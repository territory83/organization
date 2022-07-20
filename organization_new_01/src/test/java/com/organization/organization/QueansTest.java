package com.organization.organization;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.organization.organization.domain.Queans;
import com.organization.organization.mapper.QueansMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QueansTest {

    @Autowired
    private QueansMapper queansMapper;

    @Test
    void testSave(){
        Queans organizationQueans = new Queans();
        organizationQueans.setQuestion("222");
        organizationQueans.setAnswer("222");
        queansMapper.insert(organizationQueans);
    }

    @Test
    void testGetById(){
        System.out.println(queansMapper.selectById(2));
    }

    @Test
    void testGetAll(){
        System.out.println(queansMapper.selectList(null));
    }

    @Test
    void testGetPage(){

        IPage page = new Page(2,3);
        queansMapper.selectPage(page,null);
        System.out.println("第"+page.getCurrent()+"页");
        System.out.println("本页有"+page.getSize()+"条数据");
        System.out.println("共有"+page.getTotal()+"条数据");
        System.out.println("共有"+page.getPages()+"页");
        System.out.println("当当:"+page.getRecords());
    }

    @Test
    void testGetBy(){
        QueryWrapper<Queans> qw = new QueryWrapper<>();
        qw.like("question","222");
        queansMapper.selectList(qw);
    }
}
