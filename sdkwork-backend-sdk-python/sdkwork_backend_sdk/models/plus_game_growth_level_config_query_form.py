from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameGrowthLevelConfigQueryForm:
    """Growth level configuration query form"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    account_type: str = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    status: str = None
