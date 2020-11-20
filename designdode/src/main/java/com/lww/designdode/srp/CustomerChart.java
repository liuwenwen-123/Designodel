package com.lww.designdode.srp;

import java.util.ArrayList;
import java.util.List;

/**
 *    注做 数据的调用
 *    数据的梳理 给  CustomerDao  后期数据库扁了  只需要 更换 CustomerDao就行
 */
public class CustomerChart {
    private CustomerDao customerDao;
   /*    把查找出具库的 方法 踢出去
   public List<Customer> findCustomer(){
          // c查找 出具库
          List<Customer> list=new ArrayList<>();
          list.add(new Customer("lww",18));
          return list;
     }*/

     public  void displayChar(){
          for(Customer customer:customerDao.findCustomer()){
               System.out.println("customer=== "+  customer.toString());
          }
     }

     public CustomerDao getCustomerDao() {
          return customerDao;
     }

     public void setCustomerDao(CustomerDao customerDao) {
          this.customerDao = customerDao;
     }
}
