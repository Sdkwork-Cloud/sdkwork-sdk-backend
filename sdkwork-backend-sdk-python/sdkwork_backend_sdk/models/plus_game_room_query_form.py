from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameRoomQueryForm:
    """棋牌游戏房间查询表单"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    user_id: int = None
    definition_id: int = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    room_no: str = None
    room_no_like: str = None
    name_like: str = None
    room_type: str = None
    status: str = None
    visibility: str = None
    ranked: bool = None
    allow_spectator: bool = None
    leaderboard_eligible: bool = None
    replay_enabled: bool = None
    club_id: int = None
    tournament_id: int = None
    region_code: str = None
    current_match_id: int = None
