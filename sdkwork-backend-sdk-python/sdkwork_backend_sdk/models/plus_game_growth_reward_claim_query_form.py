from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameGrowthRewardClaimQueryForm:
    """Growth reward claim audit query form"""
    account_id: int = None
    user_id: int = None
    account_type: str = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
