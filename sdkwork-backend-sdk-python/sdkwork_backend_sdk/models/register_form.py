from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RegisterForm:
    """用户注册请求表单"""
    username: str = None
    password: str
    confirm_password: str = None
    email: str = None
    phone: str = None
    captcha: str = None
    captcha_id: str = None
    type: str = None
    verification_code: str = None
    invitation_code: str = None
