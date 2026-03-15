from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameMatchVO:
    """棋牌游戏对局VO"""
    created_at: str = None
    updated_at: str = None
    match_id: int = None
    definition_id: int = None
    room_id: int = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    match_no: str = None
    room_type: str = None
    status: str = None
    ranked: bool = None
    total_player_count: int = None
    club_id: int = None
    tournament_id: int = None
    region_code: str = None
    current_round_no: int = None
    max_round_count: int = None
    current_turn_seat_no: int = None
    dealer_seat_no: int = None
    winner_seat_no: int = None
    winner_user_id: int = None
    replay_id: int = None
    action_count: int = None
    move_count: int = None
    leaderboard_eligible: bool = None
    valid_for_stats: bool = None
    result_confirmed: bool = None
    abnormal_finished: bool = None
    invalid_reason: str = None
    started_at: str = None
    settled_at: str = None
    ended_at: str = None
    duration_seconds: int = None
