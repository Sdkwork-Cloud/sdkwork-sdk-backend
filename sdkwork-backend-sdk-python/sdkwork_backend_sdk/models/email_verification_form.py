from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class EmailVerificationForm:
    """邮箱验证请求表单"""
    email: str
    code: str
    type: str
