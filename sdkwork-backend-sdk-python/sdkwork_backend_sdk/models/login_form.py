from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LoginForm:
    """登录请求表单"""
    type: str = None
    email: str = None
    phone: str = None
    username: str
    password: str
    owner: str = None
    captcha: str = None
    captcha_id: str = None
    remember_me: bool = None
    verification_code: str = None
    invitation_code: str = None
