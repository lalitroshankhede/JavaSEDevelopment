package com.ConstructorInheritanceEx.BannerEx;

public class FlexBanner extends Banner{

    double price;


    public void print2(){
        System.out.println("Before - ");
        super.print(); //0
        super.price = this.price;   // assign value from FlexBanner to Banner
        System.out.println("After - ");
        super.print();   // 100
    }
}
