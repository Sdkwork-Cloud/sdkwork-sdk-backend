from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserOAuthAccountVO:
    """用户OAuth账户值对象"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    user_id: int = None
    oauth_provider: str = None
    open_id: str = None
    union_id: str = None
    app_id: str = None
    channel_account_id: int = None
    access_token_expires_at: str = None
