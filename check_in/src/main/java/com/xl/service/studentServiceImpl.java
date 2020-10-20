package com.xl.service;
import com.xl.dao.studentDao;
import com.xl.entity.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class studentServiceImpl implements studentService{

    @Autowired
    private studentDao studentdao;

    @Override
    public void register(student stu) {
        stu.setStudentid(UUID.randomUUID().toString());
        studentdao.save(stu);
    }

    @Override
    public student login(String wxs_name) {

        return studentdao.login(wxs_name);
    }
}
