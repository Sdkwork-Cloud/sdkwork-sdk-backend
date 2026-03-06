from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class QrCodeVO:
    """二维码生成响应"""
    created_at: str = None
    updated_at: str = None
    qr_key: str = None
    qr_url: str = None
    qr_content: str = None
    expire_time: int = None
