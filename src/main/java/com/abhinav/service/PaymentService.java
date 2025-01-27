package com.abhinav.service;

import com.stripe.exception.StripeException;
import com.abhinav.model.Order;
import com.abhinav.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
