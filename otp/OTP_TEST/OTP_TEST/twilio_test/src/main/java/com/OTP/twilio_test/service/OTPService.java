package com.OTP.twilio_test.service;

import com.twilio.rest.api.v2010.account.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OTPService {

    @Value("${twilio.phoneNumber}")
    private String twilioPhoneNumber;

    public String generateOTP() {
        Random random = new Random();
        int otp = 100_000 + random.nextInt(900_00);
        return String.valueOf(otp);
    }


    public void sendOTPSMS(String phoneNumber, String otp) {

        String messageBody = "Apita signal adui meka balanna :" + otp;
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(phoneNumber),
                new com.twilio.type.PhoneNumber(twilioPhoneNumber),
                messageBody).create();
    }
}
