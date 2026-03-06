from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChangePasswordForm, EmailVerificationForm, GetCurrentAccessTokenForm, LoginForm, LoginResultVO, OAuthCallbackForm, OAuthLoginRequestForm, PasswordResetForm, PasswordResetRequestForm, PermissionCheckForm, PhoneVerificationForm, PlusApiResultBoolean, PlusApiResultCurrentAccessTokenVO, PlusApiResultListString, PlusApiResultLoginResultVO, PlusApiResultOAuthLoginResponseVO, PlusApiResultPasswordResetResultVO, PlusApiResultQrCodeStatusVO, PlusApiResultQrCodeVO, PlusApiResultRegisterResultVO, PlusApiResultUserVO, PlusApiResultVerificationVO, PlusApiResultVoid, QrCodeConfirmForm, RefreshTokenForm, RegisterForm, RoleCheckForm, SendVerificationCodeForm

class AuthApi:
    """auth API client."""
    
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

    def generate_qr_code(self) -> PlusApiResultQrCodeVO:
        """Generate login QR code"""
        return self._client.post(f"/backend/v3/api/auth/qrcode/generate")

    def confirm_qr_code_login(self, body: QrCodeConfirmForm) -> PlusApiResultVoid:
        """Confirm QR login"""
        return self._client.post(f"/backend/v3/api/auth/qrcode/confirm", json=body)

    def get_auth_url(self, body: OAuthLoginRequestForm) -> PlusApiResultOAuthLoginResponseVO:
        """Get OAuth authorization URL"""
        return self._client.post(f"/backend/v3/api/auth/oauth/get_auth_url", json=body)

    def create_get_auth_url(self, body: OAuthLoginRequestForm) -> PlusApiResultOAuthLoginResponseVO:
        """Get OAuth authorization URL"""
        return self._client.post(f"/backend/v3/api/auth/oauth/authorize", json=body)

    def handle_callback(self, body: OAuthCallbackForm) -> PlusApiResultLoginResultVO:
        """Handle OAuth callback"""
        return self._client.post(f"/backend/v3/api/auth/oauth/callback", json=body)

    def has_role(self, body: RoleCheckForm) -> PlusApiResultBoolean:
        """Check role"""
        return self._client.post(f"/backend/v3/api/auth/authorization/has_role", json=body)

    def has_permission(self, body: PermissionCheckForm) -> PlusApiResultBoolean:
        """Check permission"""
        return self._client.post(f"/backend/v3/api/auth/authorization/has_permission", json=body)

    def reset_password(self, body: PasswordResetForm) -> PlusApiResultPasswordResetResultVO:
        """Reset password"""
        return self._client.post(f"/backend/v3/api/auth/authentication/reset_password", json=body)

    def request_password_reset(self, body: PasswordResetRequestForm) -> PlusApiResultPasswordResetResultVO:
        """Request password reset"""
        return self._client.post(f"/backend/v3/api/auth/authentication/request_password_reset", json=body)

    def register(self, body: RegisterForm) -> PlusApiResultRegisterResultVO:
        """Register"""
        return self._client.post(f"/backend/v3/api/auth/authentication/register", json=body)

    def refresh_token(self, body: RefreshTokenForm) -> PlusApiResultLoginResultVO:
        """Refresh token"""
        return self._client.post(f"/backend/v3/api/auth/authentication/refresh_token", json=body)

    def logout(self) -> PlusApiResultVoid:
        """Logout"""
        return self._client.post(f"/backend/v3/api/auth/authentication/logout")

    def login(self, body: LoginForm) -> LoginResultVO:
        """Login"""
        return self._client.post(f"/backend/v3/api/auth/authentication/login", json=body)

    def change_password(self, body: ChangePasswordForm) -> PlusApiResultBoolean:
        """Change password"""
        return self._client.post(f"/backend/v3/api/auth/authentication/change_password", json=body)

    def get_current_access_token(self, body: GetCurrentAccessTokenForm) -> PlusApiResultCurrentAccessTokenVO:
        """Get current tenant/organization access token"""
        return self._client.post(f"/backend/v3/api/auth/access_token/current", json=body)

    def check_qr_code_status(self, qrKey: str) -> PlusApiResultQrCodeStatusVO:
        """Check QR code status"""
        return self._client.get(f"/backend/v3/api/auth/qrcode/status/{qrKey}")

    def get_roles(self) -> PlusApiResultListString:
        """Get roles"""
        return self._client.get(f"/backend/v3/api/auth/authorization/roles")

    def get_permissions(self) -> PlusApiResultListString:
        """Get permissions"""
        return self._client.get(f"/backend/v3/api/auth/authorization/permissions")

    def get_current_user(self) -> PlusApiResultUserVO:
        """Get current user"""
        return self._client.get(f"/backend/v3/api/auth/authentication/get_current_user")
