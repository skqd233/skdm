package com.xl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class student {
    private String studentid;
    private String face_pic;
    private String major;
    private String s_class;
    private String s_id;
    private String s_name;
    private String s_sex;
    private String wxs_name;

}
