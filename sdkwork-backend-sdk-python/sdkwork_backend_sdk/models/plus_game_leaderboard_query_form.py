from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameLeaderboardQueryForm:
    """棋牌游戏排行榜查询表单"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    scope_owner_id: int = None
    ranking_type: str = None
    period_type: str = None
    scope_type: str = None
