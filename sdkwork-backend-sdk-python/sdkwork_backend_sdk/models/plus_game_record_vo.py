from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameRecordVO:
    """棋牌游戏战绩VO"""
    created_at: str = None
    updated_at: str = None
    record_id: int = None
    room_id: int = None
    match_id: int = None
    user_id: int = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    club_id: int = None
    tournament_id: int = None
    region_code: str = None
    seat_no: int = None
    team_no: int = None
    result_type: str = None
    rank_no: int = None
    nickname_snapshot: str = None
    avatar_url: str = None
    winner: bool = None
    escaped: bool = None
    leaderboard_eligible: bool = None
    action_count: int = None
    move_count: int = None
    score_before: int = None
    score_delta: int = None
    score_after: int = None
    rating_before: int = None
    rating_delta: int = None
    rating_after: int = None
    chips_before: int = None
    chips_delta: int = None
    chips_after: int = None
    joined_at: str = None
    finished_at: str = None
    best_rank_snapshot: int = None
    settlement_data: Dict[str, Any] = None
    honor_snapshot: Dict[str, Any] = None
