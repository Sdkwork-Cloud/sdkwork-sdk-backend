from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameLeaderboardVO:
    """棋牌游戏排行榜VO"""
    created_at: str = None
    updated_at: str = None
    leaderboard_id: int = None
    leaderboard_no: str = None
    name: str = None
    short_name: str = None
    game_type: str = None
    game_mode_code: str = None
    ranking_type: str = None
    period_type: str = None
    scope_type: str = None
    scope_owner_id: int = None
    scope_name: str = None
    season_key: str = None
    club_id: int = None
    tournament_id: int = None
    region_code: str = None
    status: str = None
    ranked_only: bool = None
    include_friend_room: bool = None
    include_tournament_room: bool = None
    include_club_room: bool = None
    min_match_count: int = None
    min_win_rate_match_count: int = None
    total_participant_count: int = None
    period_start_at: str = None
    period_end_at: str = None
    published_at: str = None
    settled_at: str = None
    entries: List[PlusGameLeaderboardEntryVO] = None
