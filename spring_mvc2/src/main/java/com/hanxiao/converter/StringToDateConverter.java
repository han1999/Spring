package com.hanxiao.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/6
 **/
@Component
public class StringToDateConverter implements Converter<String, Date> {


    @Override
    public Date convert(String source) {
        if (source != null && source.length() == 10) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = null;
            try {
                parse = simpleDateFormat.parse(source);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return parse;
        }
        return null;
    }
}
