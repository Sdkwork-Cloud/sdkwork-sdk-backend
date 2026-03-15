from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameHonorVO:
    """棋牌游戏荣誉记录VO"""
    created_at: str = None
    updated_at: str = None
    honor_id: int = None
    user_id: int = None
    game_type: str = None
    season_key: str = None
    source_type: str = None
    source_id: int = None
    leaderboard_id: int = None
    tournament_id: int = None
    period_type: str = None
    ranking_type: str = None
    status: str = None
    club_id: int = None
    region_code: str = None
    title: str = None
    subtitle: str = None
    description: str = None
    badge_code: str = None
    icon_url: str = None
    rank_no: int = None
    score_value: float = None
    wall_visible: bool = None
    granted_at: str = None
    expired_at: str = None
