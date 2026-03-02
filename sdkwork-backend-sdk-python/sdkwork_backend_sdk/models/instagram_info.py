from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InstagramInfo:
    user_id: str = None
    username: str = None
    full_name: str = None
    profile_picture_url: str = None
    bio: str = None
    website: str = None
    is_business_account: bool = None
