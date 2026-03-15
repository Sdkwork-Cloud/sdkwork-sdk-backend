from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameGrowthLevelConfigVO:
    """Growth level configuration view object"""
    created_at: str = None
    updated_at: str = None
    config_id: int = None
    account_type: str = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    level_no: int = None
    level_code: str = None
    level_name: str = None
    title: str = None
    badge_code: str = None
    icon_url: str = None
    required_exp: int = None
    exp_start_value: int = None
    exp_end_value: int = None
    win_exp_reward: int = None
    lose_exp_reward: int = None
    draw_exp_reward: int = None
    escape_exp_penalty: int = None
    status: str = None
    visible: bool = None
    description: str = None
    reward_config: Dict[str, Any] = None
    benefit_config: Dict[str, Any] = None
    ext_data: Dict[str, Any] = None
