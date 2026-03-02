from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import EmailVerificationForm, PhoneVerificationForm, PlusApiResultBoolean, PlusApiResultVerificationVO, SendVerificationCodeForm

class VerificationApi:
    """verification API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def verify_phone(self, body: PhoneVerificationForm) -> PlusApiResultVerificationVO:
        """Verify phone"""
        return self._client.post(f"/backend/v3/api/auth/verification/verify_phone", json=body)

    def verify_email(self, body: EmailVerificationForm) -> PlusApiResultVerificationVO:
        """Verify email"""
        return self._client.post(f"/backend/v3/api/auth/verification/verify_email", json=body)

    def send_verification_code(self, body: SendVerificationCodeForm) -> PlusApiResultBoolean:
        """Send verification code"""
        return self._client.post(f"/backend/v3/api/auth/verification/send_code", json=body)
