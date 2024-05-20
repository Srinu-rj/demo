package com.app.service;

import com.stripe.exception.StripeException;
import com.app.model.Order;
import com.app.model.PaymentResponse;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
