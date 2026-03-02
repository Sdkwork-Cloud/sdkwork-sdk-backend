from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FacebookInfo:
    user_id: str = None
    username: str = None
    name: str = None
    avatar_url: str = None
    email: str = None
    gender: str = None
    country: str = None
    city: str = None
