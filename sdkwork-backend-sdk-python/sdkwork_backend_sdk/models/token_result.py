from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TokenResult:
    """令牌结果信息"""
    token: str
    expires_in_ms: str
    created_at: str
    expired: bool = None
