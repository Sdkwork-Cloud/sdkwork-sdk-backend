from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameMatchManageForm:
    """棋牌游戏对局管理表单"""
    status: str = None
    current_round_no: int = None
    max_round_count: int = None
    current_turn_seat_no: int = None
    dealer_seat_no: int = None
    winner_seat_no: int = None
    winner_user_id: int = None
    leaderboard_eligible: bool = None
    valid_for_stats: bool = None
    result_confirmed: bool = None
    abnormal_finished: bool = None
    invalid_reason: str = None
