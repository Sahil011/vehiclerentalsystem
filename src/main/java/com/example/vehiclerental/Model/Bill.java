package com.example.vehiclerental.Model;

import java.util.List;

public class Bill {
    private Integer id;
    private Integer amount;
    private BillStatus status;
    private Integer distanceCovered;
    private Integer damageCoverAmount;
    private Booking bookingDetails;
    private List<Payment> paymentDetails;

}
