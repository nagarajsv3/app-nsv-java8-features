package com.nsv.jsmbaba.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(value = CarsPra.class)
public @interface ManufacturerPra {
    String name();
}
