from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameReplayQueryForm:
    """棋牌游戏回放查询表单"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    room_id: int = None
    match_id: int = None
    game_type: str = None
    room_type: str = None
    game_mode_code: str = None
    season_key: str = None
    club_id: int = None
    tournament_id: int = None
    region_code: str = None
    owner_user_id: int = None
    title_like: str = None
    status: str = None
    public_visible: bool = None
    allow_share: bool = None
