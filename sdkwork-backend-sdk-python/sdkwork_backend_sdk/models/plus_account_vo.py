from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAccountVO:
    """用户账户VO，记录余额和积分信息"""
    created_at: str = None
    updated_at: str = None
    user_id: int = None
    available_balance: float = None
    frozen_balance: float = None
    available_points: int = None
    frozen_points: int = None
    status: str = None
    history_list: List[PlusAccountHistoryVO] = None
