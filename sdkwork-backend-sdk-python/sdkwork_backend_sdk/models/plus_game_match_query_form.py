from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameMatchQueryForm:
    """棋牌游戏对局查询表单"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    definition_id: int = None
    room_id: int = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    match_no: str = None
    match_no_like: str = None
    room_type: str = None
    status: str = None
    ranked: bool = None
    club_id: int = None
    tournament_id: int = None
    region_code: str = None
    winner_user_id: int = None
    replay_id: int = None
    leaderboard_eligible: bool = None
    valid_for_stats: bool = None
    result_confirmed: bool = None
    abnormal_finished: bool = None
