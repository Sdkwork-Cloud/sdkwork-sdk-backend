from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameRecordQueryForm:
    """棋牌游戏战绩查询表单"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    user_id: int = None
    room_id: int = None
    match_id: int = None
    tournament_id: int = None
    club_id: int = None
    seat_no: int = None
    winner: bool = None
    escaped: bool = None
    game_type: str = None
    game_mode_code: str = None
    result_type: str = None
