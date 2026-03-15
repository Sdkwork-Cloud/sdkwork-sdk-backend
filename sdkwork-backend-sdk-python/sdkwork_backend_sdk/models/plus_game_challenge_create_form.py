from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameChallengeCreateForm:
    """棋牌游戏挑战赛创建表单"""
    challenger_user_id: int = None
    target_user_id: int = None
    game_type: str = None
    game_mode_code: str = None
    stake_score: int = None
    source_type: str = None
    arena_id: int = None
    leaderboard_id: int = None
    reason: str = None
