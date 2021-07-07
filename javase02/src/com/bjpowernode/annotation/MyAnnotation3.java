package com.bjpowernode.annotation;

public @interface MyAnnotation3 {
    int age() default 22;
    String name();

    int[] ages();
}
