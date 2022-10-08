package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("hibernate")
public class HibernateImplAlpha implements AlphaDao{


    @Override
    public String select() {
        return "Hibernate";
    }
}
