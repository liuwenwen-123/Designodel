package com.lww.designdode.srp;

import java.util.ArrayList;
import java.util.List;

/**
 *  只做 数据处理  增删改查
 */
public class CustomerDao {

    public List<Customer> findCustomer(){
        // c查找 出具库
        List<Customer> list=new ArrayList<>();
        list.add(new Customer("lww",18));
        return list;
    }

}
