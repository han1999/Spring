package com.hanxiao.bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/9
 **/
@Data
public class User {
    @Length(min = 6, max = 10)
    private String username;
    @Length(min = 6, max = 10)
    private String password;

    @Min(18)
    @Max(80)
    private Integer age;
    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
}
