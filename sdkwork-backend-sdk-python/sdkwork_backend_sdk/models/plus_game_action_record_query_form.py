from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameActionRecordQueryForm:
    """棋牌游戏动作流水查询表单"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    room_id: int = None
    match_id: int = None
    player_user_id: int = None
    action_type: str = None
    action_code: str = None
