from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GetCurrentAccessTokenForm:
    """获取当前租户/组织访问令牌请求"""
    app_id: int
    platform: str
