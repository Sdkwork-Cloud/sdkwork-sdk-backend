from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameTournamentBatchArrangePlayerForm:
    """棋牌游戏赛事参赛者批量编排项"""
    user_id: int = None
    seed_no: int = None
    team_no: int = None
