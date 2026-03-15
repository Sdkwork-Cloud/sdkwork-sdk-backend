from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameChallengeManageForm:
    """棋牌游戏挑战赛管理表单"""
    status: str = None
    winner_user_id: int = None
    room_id: int = None
    match_id: int = None
    reason: str = None
