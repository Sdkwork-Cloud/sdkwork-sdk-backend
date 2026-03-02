from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PhoneVerificationForm:
    """手机验证请求表单"""
    phone: str
    code: str
    type: str
