from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameRoomVO:
    """棋牌游戏房间VO"""
    created_at: str = None
    updated_at: str = None
    room_id: int = None
    user_id: int = None
    definition_id: int = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    room_no: str = None
    name: str = None
    room_type: str = None
    status: str = None
    visibility: str = None
    seat_count: int = None
    current_player_count: int = None
    min_start_player_count: int = None
    host_seat_no: int = None
    club_id: int = None
    tournament_id: int = None
    region_code: str = None
    current_match_id: int = None
    current_round_no: int = None
    planned_round_count: int = None
    finished_round_count: int = None
    ranked: bool = None
    allow_spectator: bool = None
    allow_robot: bool = None
    allow_trusteeship: bool = None
    leaderboard_eligible: bool = None
    replay_enabled: bool = None
    spectator_count: int = None
    invite_code: str = None
    rule_config: Dict[str, Any] = None
    ext_data: Dict[str, Any] = None
    started_at: str = None
    ended_at: str = None
    last_active_at: str = None
