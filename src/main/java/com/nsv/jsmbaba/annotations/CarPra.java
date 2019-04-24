package com.nsv.jsmbaba.annotations;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@ManufacturerPra(name="Toyato")
@ManufacturerPra(name="BMW")
@ManufacturerPra(name="Honda")
public class CarPra {
    private String name;
}
