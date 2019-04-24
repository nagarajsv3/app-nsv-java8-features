package com.nsv.jsmbaba.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CarsPra {
    ManufacturerPra[] value();
}
