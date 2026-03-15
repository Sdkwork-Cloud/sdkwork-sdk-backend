from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameGrowthRecordQueryForm:
    """Growth record query form"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    user_id: int = None
    account_type: str = None
    game_type: str = None
    game_mode_code: str = None
    season_key: str = None
    room_id: int = None
    match_id: int = None
    tournament_id: int = None
    source_type: str = None
