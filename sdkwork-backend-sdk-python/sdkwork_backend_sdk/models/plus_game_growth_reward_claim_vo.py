from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameGrowthRewardClaimVO:
    """Growth reward claim audit view object"""
    created_at: str = None
    updated_at: str = None
    account_id: int = None
    user_id: int = None
    account_type: str = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    current_level_no: int = None
    level_no: int = None
    level_code: str = None
    level_name: str = None
    title: str = None
    badge_code: str = None
    claimed_at: str = None
    reward_issued_at: str = None
    operator_user_id: int = None
    reward_config: Dict[str, Any] = None
    reward_summary: Dict[str, Any] = None
