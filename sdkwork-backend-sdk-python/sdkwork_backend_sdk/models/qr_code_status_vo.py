from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class QrCodeStatusVO:
    """二维码状态响应"""
    created_at: str = None
    updated_at: str = None
    status: str = None
    user_info: UserVO = None
    token: LoginResultVO = None
