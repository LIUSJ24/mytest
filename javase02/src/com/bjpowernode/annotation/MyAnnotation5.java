package com.bjpowernode.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
@Inherited
//@Native
public @interface MyAnnotation5 {
}
