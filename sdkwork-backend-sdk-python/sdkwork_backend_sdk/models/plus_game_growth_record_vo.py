from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameGrowthRecordVO:
    """Growth record view object"""
    created_at: str = None
    updated_at: str = None
    record_id: int = None
    user_id: int = None
    account_type: str = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    room_id: int = None
    match_id: int = None
    tournament_id: int = None
    source_type: str = None
    biz_no: str = None
    reason: str = None
    exp_before: int = None
    exp_delta: int = None
    exp_after: int = None
    total_exp_before: int = None
    total_exp_delta: int = None
    total_exp_after: int = None
    level_config_id_before: int = None
    level_config_id_after: int = None
    level_no_before: int = None
    level_no_after: int = None
    level_code_before: str = None
    level_code_after: str = None
    level_up: bool = None
    operator_user_id: int = None
    occurred_at: str = None
    settlement_data: Dict[str, Any] = None
    ext_data: Dict[str, Any] = None
