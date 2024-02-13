package com.OTP.twilio_test.controller;

import com.OTP.twilio_test.service.OTPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sms/test")
public class OTPController {

    @Autowired
    private OTPService otpService;

    @PostMapping("/send-otp")
    public String sendOTP(@RequestParam String phoneNumber){
     String otp = otpService.generateOTP();
     otpService.sendOTPSMS(phoneNumber,otp);
     return "otp sent success";
    }
}
