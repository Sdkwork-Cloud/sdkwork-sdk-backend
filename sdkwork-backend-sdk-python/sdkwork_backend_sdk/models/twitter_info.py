from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TwitterInfo:
    user_id: str = None
    username: str = None
    display_name: str = None
    avatar_url: str = None
    bio: str = None
    location: str = None
    website: str = None
