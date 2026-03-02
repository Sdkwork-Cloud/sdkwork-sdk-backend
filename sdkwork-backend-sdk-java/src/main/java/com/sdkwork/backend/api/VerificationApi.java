package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VerificationApi {
    private final HttpClient client;
    
    public VerificationApi(HttpClient client) {
        this.client = client;
    }

    /** Verify phone */
    public PlusApiResultVerificationVO verifyPhone(PhoneVerificationForm body) throws Exception {
        return (PlusApiResultVerificationVO) client.post(ApiPaths.backendPath("/auth/verification/verify_phone"), body);
    }

    /** Verify email */
    public PlusApiResultVerificationVO verifyEmail(EmailVerificationForm body) throws Exception {
        return (PlusApiResultVerificationVO) client.post(ApiPaths.backendPath("/auth/verification/verify_email"), body);
    }

    /** Send verification code */
    public PlusApiResultBoolean sendVerificationCode(SendVerificationCodeForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/auth/verification/send_code"), body);
    }
}
