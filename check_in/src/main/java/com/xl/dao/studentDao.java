package com.xl.dao;

import com.xl.entity.student;

public interface studentDao {
    void save(student stu);
    student login(String vxs_name);
}
