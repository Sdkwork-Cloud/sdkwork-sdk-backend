from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameArenaManageForm:
    """棋牌游戏擂台管理表单"""
    owner_user_id: int = None
    current_champion_user_id: int = None
    game_type: str = None
    game_mode_code: str = None
    status: str = None
    name: str = None
    description: str = None
    stake_score: int = None
    room_id: int = None
    match_id: int = None
    reason: str = None
