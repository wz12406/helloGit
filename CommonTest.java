package com.minxinloan.borrow.service;

import com.minxinloan.common.utils.DateUtils;

import java.util.Date;

/**
 * @author Administrator
 * @date 2016/11/8 19:50
 * @desc
 */
public class CommonTest {

    public static void main(String[] args) {

        Date date = new Date();
        Date date2 = DateUtils.addMonths(date,2);
        Date date3 = DateUtils.addDays(date2, 1);
        System.out.println(DateUtils.formatDate(date3));
        
    }
}
