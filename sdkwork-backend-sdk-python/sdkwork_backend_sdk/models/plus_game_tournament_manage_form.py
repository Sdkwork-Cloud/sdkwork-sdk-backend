from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameTournamentManageForm:
    """棋牌游戏赛事管理表单"""
    status: str = None
    sign_up_start_at: str = None
    sign_up_end_at: str = None
    start_at: str = None
    end_at: str = None
    winner_user_id: int = None
    winner_club_id: int = None
