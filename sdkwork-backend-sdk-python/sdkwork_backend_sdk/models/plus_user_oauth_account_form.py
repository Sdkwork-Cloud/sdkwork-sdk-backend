from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserOAuthAccountForm:
    """User OAuth account creation form"""
    user_id: int
    oauth_provider: str
    open_id: str
    union_id: str = None
    app_id: str = None
    channel_account_id: int = None
    access_token_expires_at: str = None
