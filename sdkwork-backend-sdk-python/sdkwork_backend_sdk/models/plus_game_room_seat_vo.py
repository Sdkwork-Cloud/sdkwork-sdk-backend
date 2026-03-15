from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameRoomSeatVO:
    """棋牌游戏房间座位VO"""
    created_at: str = None
    updated_at: str = None
    seat_id: int = None
    room_id: int = None
    definition_id: int = None
    game_type: str = None
    user_id: int = None
    seat_no: int = None
    status: str = None
    player_type: str = None
    nickname_snapshot: str = None
    avatar_url: str = None
    join_source: str = None
    team_no: int = None
    ready: bool = None
    trusteeship: bool = None
    spectator: bool = None
    room_score: int = None
    chips: int = None
    eliminated_rank_no: int = None
    joined_at: str = None
    eliminated_at: str = None
    left_at: str = None
    hand_snapshot: Dict[str, Any] = None
