package hello.core.singleton;

import java.sql.SQLOutput;

public class StatefulService {

    private int price; // 상태를 유지하는 필드

    public int order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
        this.price = price; // 여기까지만 하면 문제
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
