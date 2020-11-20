package com.lww.designdode.srp;

/**
 *   单一职责
 */
public class TestSrp {
    public static void main(String[] args) {
//         new CustomerChart().displayChar();

        CustomerChart customerChart = new CustomerChart();
        customerChart.setCustomerDao(new CustomerDao());
        customerChart.displayChar();
    }
}
