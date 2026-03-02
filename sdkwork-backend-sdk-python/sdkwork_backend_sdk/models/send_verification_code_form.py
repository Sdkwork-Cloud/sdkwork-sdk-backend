from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SendVerificationCodeForm:
    """发送验证码请求表单"""
    identifier: str
    method: str
    type: str
