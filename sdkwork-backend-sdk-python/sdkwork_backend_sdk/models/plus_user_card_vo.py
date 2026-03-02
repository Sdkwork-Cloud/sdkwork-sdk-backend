from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserCardVO:
    """用户会员卡VO，用于表示用户与会员卡的绑定关系"""
    created_at: str = None
    updated_at: str = None
    user_id: int = None
    card_id: int = None
    card_code: str = None
    acquire_time: str = None
    activate_time: str = None
    cancel_time: str = None
    points: int = None
    balance: int = None
