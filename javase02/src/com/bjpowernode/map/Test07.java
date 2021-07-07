package com.bjpowernode.map;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap的构造方法：
     * HashMap()
     * 构造一个默认的初始容量的空 HashMap（16）和默认的加载因子（0.75）。
     * HashMap(int initialCapacity)
     * 构建了一个具有指定的初始容量和加载因子空 HashMap（0.75）。
     * HashMap(int initialCapacity, float loadFactor)
     * 构造一个空 HashMap具有指定的初始容量和加载因子。
     * HashMap(Map<? extends K,? extends V> m)
     * 构建了一种新的 HashMap与指定的 Map相同的映射。
 */
public class Test07 {
    public static void main(String[] args) {
        // HashMap(int initialCapacity)
        // 为了减少底层数组的扩容次数，可以创建HashMap集合的时候，指定一个尽量大一点的初始化长度，可以提高效率。
        // 初始化容量，一般建议是2的幂次方，因为这个数字满足散列分布均匀的规则。
        Map<Integer, String> map = new HashMap<>(1024);

        // HashMap(int initialCapacity, float loadFactor)
        Map<Integer,String> map1 = new HashMap<>(1024,0.8F);

    }
}
