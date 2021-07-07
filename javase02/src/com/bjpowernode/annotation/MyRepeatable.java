package com.bjpowernode.annotation;

import java.lang.annotation.Repeatable;

/**
 * 在这个注解中，定义一个Repeatable元注解，该注解的属性是注解容器的Class对象
 */
@Repeatable(MyRepeatables.class)
public @interface MyRepeatable {
}
