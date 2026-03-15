from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameScoreRecordQueryForm:
    """棋牌游戏积分流水查询表单"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    user_id: int = None
    game_type: str = None
    change_type: str = None
    tournament_id: int = None
    room_id: int = None
    match_id: int = None
    leaderboard_id: int = None
    biz_no: str = None
    operator_user_id: int = None
