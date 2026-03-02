from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TikTokInfo:
    user_id: str = None
    username: str = None
    display_name: str = None
    avatar_url: str = None
    bio: str = None
    is_verified: bool = None
    follower_count: int = None
    following_count: int = None
    like_count: int = None
