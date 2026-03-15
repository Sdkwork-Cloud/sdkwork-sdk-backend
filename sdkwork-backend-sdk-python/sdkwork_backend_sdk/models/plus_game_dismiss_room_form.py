from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameDismissRoomForm:
    """棋牌游戏房间解散表单"""
    reason: str = None
