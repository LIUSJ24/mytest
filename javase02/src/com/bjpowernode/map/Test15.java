package com.bjpowernode.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 模拟淘宝的商品列表，对商品分别按照商品编号、商品价格、商品销量进行排序
 */
public class Test15 {
    public static void main(String[] args) {
        Goods g1 = new Goods("10001",99.99,100);
        Goods g2 = new Goods("10009",599.99,700);
        Goods g3 = new Goods("10004",399.99,500);
        Goods g4 = new Goods("10002",199.99,160);
        Goods g5 = new Goods("10005",299.99,400);
        // 在控制台输出这5个商品，希望输出的商品按照编号进行排序
        Map<Goods, String> map = new TreeMap<>(new NoComparator());
        map.put(g1,"鼠标");
        map.put(g2,"键盘");
        map.put(g3,"话筒");
        map.put(g4,"手机");
        map.put(g5,"杯子");
        System.out.println(map);
        // 在控制台输出这5个商品，希望输出的商品按照价格进行排序
        Map<Goods, String> map1 = new TreeMap<>(new PriceComparator());
        map1.put(g1,"鼠标");
        map1.put(g2,"键盘");
        map1.put(g3,"话筒");
        map1.put(g4,"手机");
        map1.put(g5,"杯子");
        System.out.println(map1);
        // 在控制台输出这5个商品，希望输出的商品按照销量进行排序
        Map<Goods, String> map2 = new TreeMap<>(new SaleNumComparator());
        map2.put(g1,"鼠标");
        map2.put(g2,"键盘");
        map2.put(g3,"话筒");
        map2.put(g4,"手机");
        map2.put(g5,"杯子");
        System.out.println(map2);
    }
}
class Goods {
    private String no;
    private double price;
    private int saleNum;

    public Goods(String no, double price, int saleNum) {
        this.no = no;
        this.price = price;
        this.saleNum = saleNum;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "no='" + no + '\'' +
                ", price=" + price +
                ", saleNum=" + saleNum +
                '}';
    }
}
// 定义用来按照商品编号排序的比较器
class NoComparator implements Comparator<Goods>{

    @Override
    public int compare(Goods o1, Goods o2) {
        return o1.getNo().compareTo(o2.getNo());
    }
}
// 定义价格比较器
class PriceComparator implements Comparator<Goods> {

    @Override
    public int compare(Goods o1, Goods o2) {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
// 定义销量比较器
class SaleNumComparator implements Comparator<Goods> {

    @Override
    public int compare(Goods o1, Goods o2) {
        return o1.getSaleNum() - o2.getSaleNum();
    }
}