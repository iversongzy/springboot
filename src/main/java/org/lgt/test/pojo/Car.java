package org.lgt.test.pojo;

import java.util.Objects;

/**
 * @Description
 * @Author liuguotai
 * @Date2021/5/12 0:08
 **/
public class Car {
    private String brand;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }

    @Override
    public String toString() {
        return "org.lgt.test.pojo.Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
