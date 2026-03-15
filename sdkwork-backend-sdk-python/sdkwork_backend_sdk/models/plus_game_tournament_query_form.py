from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameTournamentQueryForm:
    """棋牌游戏赛事查询表单"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    game_type: str = None
    status: str = None
