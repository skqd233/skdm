package com.xl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class signinfo {
    private String signid;
    private String sign_link;
    private String sign_remark;
    private String sign_time;
    private String sign_title;
    private String sign_type;
}
