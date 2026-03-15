from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameTournamentBatchStatusForm:
    """棋牌游戏赛事参赛者批量状态管理表单"""
    user_ids: List[int] = None
    player_items: List[PlusGameTournamentBatchStatusPlayerForm] = None
    status: str = None
    start_rank_no: int = None
