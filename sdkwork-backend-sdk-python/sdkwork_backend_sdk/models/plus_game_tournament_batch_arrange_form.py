from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameTournamentBatchArrangeForm:
    """棋牌游戏赛事参赛者批量编排表单"""
    user_ids: List[int] = None
    arrange_players: List[PlusGameTournamentBatchArrangePlayerForm] = None
    seed_no_start: int = None
    team_no_start: int = None
    group_size: int = None
    overwrite_existing_seed_no: bool = None
    overwrite_existing_team_no: bool = None
