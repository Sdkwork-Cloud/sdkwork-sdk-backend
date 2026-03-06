from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OAuthLoginResponseVO:
    """OAuth第三方登录响应"""
    created_at: str = None
    updated_at: str = None
    provider: str = None
    auth_url: str = None
    qr_code_url: str = None
    qr_code_content: str = None
    expires_in: int = None
