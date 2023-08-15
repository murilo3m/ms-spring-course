package com.murilo3m.msspringcourse.services;

import com.murilo3m.msspringcourse.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days){
        return new Payment("Bob", 100.0, days);
    }
}
