from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameRoomSeatManageForm:
    """棋牌游戏房间座位管理表单"""
    user_id: int = None
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
