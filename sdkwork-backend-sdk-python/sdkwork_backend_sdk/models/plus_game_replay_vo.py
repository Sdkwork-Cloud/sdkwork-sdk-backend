from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameReplayVO:
    """棋牌游戏回放VO"""
    created_at: str = None
    updated_at: str = None
    replay_id: int = None
    replay_no: str = None
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
    title: str = None
    status: str = None
    public_visible: bool = None
    allow_share: bool = None
    duration_seconds: int = None
    action_count: int = None
    key_frame_count: int = None
    storage_key: str = None
    cover_url: str = None
    board_snapshot: Dict[str, Any] = None
    key_frames: Dict[str, Any] = None
    started_at: str = None
    ended_at: str = None
    expired_at: str = None
