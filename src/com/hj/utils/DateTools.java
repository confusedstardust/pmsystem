package com.hj.utils;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//前台与后台显示日期均无误，但数据库中会少一天(已经解决)
public class DateTools {
    public static Date change(String str) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
//        opDate(date,2);
        return date;
    }
    public static String getNowDateShort() {
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd");
        Date date = new Date();// 获取当前时间
        return sdf.format(date);// 输出已经格式化的现在时间（24小时制）
    }



//    此处的操作日期方法屁用没有
//    public static Date opDate(Date d,int i){
//        Calendar calendar=Calendar.getInstance();//获得日历对象
//        calendar.setTime(d);
//        calendar.add(Calendar.DAY_OF_MONTH,i);
//        return d;
//    }
}
