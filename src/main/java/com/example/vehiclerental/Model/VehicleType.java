package com.example.vehiclerental.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

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


    private String code;
    VehicleType(String code) {
        this.code= code;
    }

//    @JsonCreator
//    public static VehicleType getValue(String parameterName) {
//        if (parameterName != null) {
//            for (VehicleType objType : VehicleType.values()) {
//                if (parameterName.equalsIgnoreCase(objType.name())) {
//                    return objType;
//                }
//            }
//        }
//        return null;
//    }

    @JsonCreator
    public static VehicleType decode(final String code) {
        return Stream.of(VehicleType.values()).filter(targetEnum -> targetEnum.code.equals(code)).findFirst().orElse(null);
    }
    @JsonValue
    public String getCode(){
        return code;
    }



    /*

    private String code;

	private EnItemType(String code) {
		this.code=code;
	}

	@JsonCreator
	public static EnItemType decode(final String code) {
		return Stream.of(EnItemType.values()).filter(targetEnum -> targetEnum.code.equals(code)).findFirst().orElse(null);
	}

	@JsonValue
	public String getCode() {
		return code;
	}




     */

}
