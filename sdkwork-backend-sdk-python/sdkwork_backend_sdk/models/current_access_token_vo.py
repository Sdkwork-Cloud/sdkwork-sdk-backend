from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CurrentAccessTokenVO:
    """当前上下文访问令牌结果"""
    created_at: str = None
    updated_at: str = None
    app_id: int = None
    app_name: str = None
    platform: str = None
    tenant_id: int = None
    organization_id: int = None
    tenant_access_token: TokenResult = None
    organization_access_token: TokenResult = None
