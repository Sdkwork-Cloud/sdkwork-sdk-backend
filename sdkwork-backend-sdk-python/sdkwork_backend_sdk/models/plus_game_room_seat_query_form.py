from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameRoomSeatQueryForm:
    """棋牌游戏房间座位查询表单"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    room_id: int = None
    user_id: int = None
    status: str = None
