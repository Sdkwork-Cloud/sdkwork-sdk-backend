from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameTournamentBatchStatusPlayerForm:
    """棋牌游戏赛事参赛者批量状态项"""
    user_id: int = None
    status: str = None
    rank_no: int = None
    score_value: float = None
    total_match_count: int = None
    win_count: int = None
    lose_count: int = None
