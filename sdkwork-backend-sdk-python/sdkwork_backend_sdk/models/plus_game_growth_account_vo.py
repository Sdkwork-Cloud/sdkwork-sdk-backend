from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameGrowthAccountVO:
    """Growth account view object"""
    created_at: str = None
    updated_at: str = None
    account_id: int = None
    user_id: int = None
    account_type: str = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    current_level_config_id: int = None
    current_level_no: int = None
    current_level_code: str = None
    current_level_name: str = None
    current_title: str = None
    current_badge_code: str = None
    current_exp: int = None
    total_exp: int = None
    current_level_start_exp: int = None
    next_level_required_exp: int = None
    exp_to_next_level: int = None
    progress_percent: float = None
    peak_level_no: int = None
    peak_exp: int = None
    level_up_count: int = None
    reward_claimed_count: int = None
    last_gain_at: str = None
    last_level_up_at: str = None
    last_reset_at: str = None
    active: bool = None
    last_claimed_level_no: int = None
    last_reward_claimed_at: str = None
    last_reward_issued_at: str = None
    last_claimed_reward_level_code: str = None
    last_claimed_reward_level_name: str = None
    last_claimed_reward_summary: Dict[str, Any] = None
    last_claimed_reward_config: Dict[str, Any] = None
    ext_data: Dict[str, Any] = None
