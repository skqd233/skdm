package com.xl.service;

import com.xl.entity.student;

public interface studentService {
    void register(student stu);
    student login(String wxs_name);
}
