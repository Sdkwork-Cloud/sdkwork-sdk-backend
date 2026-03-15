from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameStatsQueryForm:
    """妫嬬墝娓告垙鐜╁缁熻鏌ヨ琛ㄥ崟"""
    user_id: int
    game_type: str
    game_mode_code: str = None
    season_key: str = None
    scope_type: str = None
    scope_owner_id: int = None
