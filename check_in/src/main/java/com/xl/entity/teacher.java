package com.xl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class teacher {
    private String teacherid;
    private String t_college;
    private String t_name;
    private String t_school;
    private String wxt_name;
}
