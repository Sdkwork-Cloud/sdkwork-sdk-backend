from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChangePasswordForm, LoginForm, LoginResultVO, PasswordResetForm, PasswordResetRequestForm, PlusApiResultBoolean, PlusApiResultLoginResultVO, PlusApiResultPasswordResetResultVO, PlusApiResultRegisterResultVO, PlusApiResultUserVO, PlusApiResultVoid, RefreshTokenForm, RegisterForm

class AuthenticationApi:
    """authentication API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def reset_password(self, body: PasswordResetForm) -> PlusApiResultPasswordResetResultVO:
        """重置密码"""
        return self._client.post(f"/backend/v3/api/auth/authentication/reset_password", json=body)

    def request_password_reset(self, body: PasswordResetRequestForm) -> PlusApiResultPasswordResetResultVO:
        """请求密码重置"""
        return self._client.post(f"/backend/v3/api/auth/authentication/request_password_reset", json=body)

    def register(self, body: RegisterForm) -> PlusApiResultRegisterResultVO:
        """用户注册"""
        return self._client.post(f"/backend/v3/api/auth/authentication/register", json=body)

    def refresh_token(self, body: RefreshTokenForm) -> PlusApiResultLoginResultVO:
        """刷新访问令牌"""
        return self._client.post(f"/backend/v3/api/auth/authentication/refresh_token", json=body)

    def logout(self) -> PlusApiResultVoid:
        """退出登录"""
        return self._client.post(f"/backend/v3/api/auth/authentication/logout")

    def login(self, body: LoginForm) -> LoginResultVO:
        """用户登录"""
        return self._client.post(f"/backend/v3/api/auth/authentication/login", json=body)

    def change_password(self, body: ChangePasswordForm) -> PlusApiResultBoolean:
        """修改密码"""
        return self._client.post(f"/backend/v3/api/auth/authentication/change_password", json=body)

    def get_current_user(self) -> PlusApiResultUserVO:
        """获取当前用户信息"""
        return self._client.get(f"/backend/v3/api/auth/authentication/get_current_user")
