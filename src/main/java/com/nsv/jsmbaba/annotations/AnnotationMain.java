package com.nsv.jsmbaba.annotations;

public class AnnotationMain {

    public static void main(String[] args) {

        Manufacturer[] manufacturers = Car.class.getAnnotationsByType(Manufacturer.class);
        for (Manufacturer manufacturer : manufacturers) {
            System.out.println(manufacturer.name());
        }


        System.out.println("******************");
        ManufacturerPra[] annotationsByType = CarPra.class.getAnnotationsByType(ManufacturerPra.class);
        for (ManufacturerPra manu:annotationsByType) {
            System.out.println(manu.name());
        }

    }
}
