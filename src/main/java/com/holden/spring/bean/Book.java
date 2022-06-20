package com.holden.spring.bean;

/**
 * @ClassName sheji-Book
 * @Athor Holden_-__--___Xiao
 * @Create 2022年6月18日13:17 - 周六
 * @Describe
 */
public class Book {
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String bname;
    private String address;

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void show() {
        System.out.println(bname + ":" + address);
    }


}
