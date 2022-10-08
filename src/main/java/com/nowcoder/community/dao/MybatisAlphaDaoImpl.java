package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mybatis")
public class MybatisAlphaDaoImpl implements AlphaDao{

    @Override
    public String select() {
        return "Mybatis";
    }
}
