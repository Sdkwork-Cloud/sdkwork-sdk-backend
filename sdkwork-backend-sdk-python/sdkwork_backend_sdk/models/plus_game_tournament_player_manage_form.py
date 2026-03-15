from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameTournamentPlayerManageForm:
    """棋牌游戏赛事参赛者管理表单"""
    status: str = None
    seed_no: int = None
    rank_no: int = None
    team_no: int = None
    score_value: float = None
    total_match_count: int = None
    win_count: int = None
    lose_count: int = None
