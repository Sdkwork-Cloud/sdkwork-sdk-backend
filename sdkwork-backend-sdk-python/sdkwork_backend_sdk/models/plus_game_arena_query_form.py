from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameArenaQueryForm:
    """棋牌游戏擂台查询表单"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    owner_user_id: int = None
    current_champion_user_id: int = None
    game_type: str = None
    game_mode_code: str = None
    status: str = None
