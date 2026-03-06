from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class QrCodeConfirmForm:
    """二维码确认登录请求"""
    qr_key: str
    token: str
