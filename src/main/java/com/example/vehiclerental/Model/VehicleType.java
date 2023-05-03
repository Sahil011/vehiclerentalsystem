package com.example.vehiclerental.Model;

import java.util.HashMap;
import java.util.Map;

public enum VehicleType {
    HATCHBACK("HATCHBACK"),
    SUV("SUV"),
    SEDAN("SEDAN"),
    THREE("THREE"),
    WHEELER("WHEELER"),
    TRUCK("TRUCK"),
    VAN("VAN"),
    MOTORCYCLE("MOTORCYCLE"),
    BICYCLE("BICYCLE");

    VehicleType(String motorcycle) {
    }

    public static VehicleType getValue(String parameterName) {
        if (parameterName != null) {
            for (VehicleType objType : VehicleType.values()) {
                if (parameterName.equalsIgnoreCase(objType.name())) {
                    return objType;
                }
            }
        }
        return null;
    }
}
