package com.xl.dao;

import com.xl.entity.manager;
import org.apache.ibatis.annotations.Param;

public interface managerDao {
    manager login(@Param("account") String account, @Param("password") String password);


}
