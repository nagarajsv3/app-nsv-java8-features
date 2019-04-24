package com.nsv.jsmbaba.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(value = Cars.class)
public @interface Manufacturer {
    String name();
}
