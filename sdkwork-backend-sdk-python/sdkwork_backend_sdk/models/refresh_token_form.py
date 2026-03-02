from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RefreshTokenForm:
    """刷新令牌请求表单"""
    refresh_token: str
