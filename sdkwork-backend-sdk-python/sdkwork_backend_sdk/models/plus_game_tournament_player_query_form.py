from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameTournamentPlayerQueryForm:
    """棋牌游戏赛事参赛者查询表单"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    tournament_id: int = None
    user_id: int = None
    status: str = None
