from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameScoreRecordVO:
    """棋牌游戏积分流水VO"""
    created_at: str = None
    updated_at: str = None
    record_id: int = None
    user_id: int = None
    game_type: str = None
    season_key: str = None
    tournament_id: int = None
    room_id: int = None
    match_id: int = None
    leaderboard_id: int = None
    change_type: str = None
    ranking_type: str = None
    period_type: str = None
    scope_type: str = None
    biz_no: str = None
    reason: str = None
    score_before: int = None
    score_delta: int = None
    score_after: int = None
    rating_before: int = None
    rating_delta: int = None
    rating_after: int = None
    chips_before: int = None
    chips_delta: int = None
    chips_after: int = None
    operator_user_id: int = None
    occurred_at: str = None
    settlement_data: Dict[str, Any] = None
    ext_data: Dict[str, Any] = None
