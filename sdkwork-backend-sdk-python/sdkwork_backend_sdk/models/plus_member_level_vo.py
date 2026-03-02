from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMemberLevelVO:
    """会员等级VO，包含等级名称、所需积分、特权描述等信息"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    card_id: int = None
    level_name: str = None
    required_points: int = None
    description: str = None
    status: str = None
