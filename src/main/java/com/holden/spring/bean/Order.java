package com.holden.spring.bean;

/**
 * @ClassName sheji-Order
 * @Athor Holden_-__--___Xiao
 * @Create 2022年6月18日17:30 - 周六
 * @Describe
 */
public class Order {
    public Order(String oname) {
        this.oname = oname;
    }

    public Order() {
    }

    private String oname;

    public void show(){
        System.out.println(oname);
    }

}
