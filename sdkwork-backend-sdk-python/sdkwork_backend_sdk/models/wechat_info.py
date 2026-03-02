from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WechatInfo:
    open_id: str = None
    union_id: str = None
    nickname: str = None
    avatar_url: str = None
    gender: int = None
    country: str = None
    province: str = None
    city: str = None
