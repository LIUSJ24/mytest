package com.bjpowernode.collection.list;

import java.util.List;
import java.util.Vector;

/**
 * Vector集合
 * newCapacity = oldCapacity + ((capacityIncrement > 0) ?
 *                                          capacityIncrement : oldCapacity);
 */
public class VectorTest01 {
    public static void main(String[] args) {
        // 1.创建Vector集合对象(构造方法，在底层直接创建了一个长度是10的数组Object[] elementData = new Object[10])
        List<Integer> vector = new Vector<>();
        // 2.向集合中添加元素
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(50);
        vector.add(50);
        vector.add(50);
        vector.add(50);
        vector.add(50);

        // 添加第11个元素，底层数组满了，如果扩容
        vector.add(2);

    }
}
