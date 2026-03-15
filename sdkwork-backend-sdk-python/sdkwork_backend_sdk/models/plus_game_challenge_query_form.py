from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameChallengeQueryForm:
    """棋牌游戏挑战赛查询表单"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    challenger_user_id: int = None
    target_user_id: int = None
    arena_id: int = None
    winner_user_id: int = None
    game_type: str = None
    status: str = None
    source_type: str = None
