from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameGrowthAccountRefreshForm:
    """Growth account refresh form"""
    user_id: int
    account_type: str
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
