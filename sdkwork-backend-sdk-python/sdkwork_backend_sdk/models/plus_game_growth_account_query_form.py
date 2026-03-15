from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameGrowthAccountQueryForm:
    """Growth account query form"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    user_id: int = None
    account_type: str = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    active: bool = None
