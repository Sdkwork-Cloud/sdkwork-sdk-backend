from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameActionRecordVO:
    """棋牌游戏动作流水VO"""
    created_at: str = None
    updated_at: str = None
    action_id: int = None
    room_id: int = None
    match_id: int = None
    round_id: int = None
    game_type: str = None
    room_type: str = None
    replay_id: int = None
    tournament_id: int = None
    player_user_id: int = None
    seat_no: int = None
    player_type: str = None
    seq_no: int = None
    turn_no: int = None
    phase_name: str = None
    action_type: str = None
    action_code: str = None
    notation: str = None
    target_seat_no: int = None
    source_position: str = None
    target_position: str = None
    consume_millis: int = None
    valid_action: bool = None
    system_action: bool = None
    timeout_action: bool = None
    action_at: str = None
    action_payload: Dict[str, Any] = None
    before_state: Dict[str, Any] = None
    after_state: Dict[str, Any] = None
