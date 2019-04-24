package com.nsv.jsmbaba.annotations;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Manufacturer(name="Toyato")
@Manufacturer(name="Honda")
@Manufacturer(name="BMW")
public class Car {
    private String make;
}
