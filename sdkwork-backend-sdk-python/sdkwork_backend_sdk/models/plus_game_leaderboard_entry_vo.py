from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameLeaderboardEntryVO:
    """棋牌游戏排行榜明细VO"""
    created_at: str = None
    updated_at: str = None
    entry_id: int = None
    leaderboard_id: int = None
    user_id: int = None
    ranking_type: str = None
    period_type: str = None
    scope_type: str = None
    scope_owner_id: int = None
    season_key: str = None
    nickname_snapshot: str = None
    avatar_url: str = None
    rank_no: int = None
    previous_rank_no: int = None
    peak_rank_no: int = None
    status: str = None
    score_value: float = None
    score_delta: float = None
    tie_breaker_value: float = None
    display_value: str = None
    total_match_count: int = None
    win_count: int = None
    lose_count: int = None
    draw_count: int = None
    streak_count: int = None
    reward_granted: bool = None
    reward_issued_at: str = None
    badge_code: str = None
