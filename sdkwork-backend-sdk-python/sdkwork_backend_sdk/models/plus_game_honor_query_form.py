from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGameHonorQueryForm:
    """妫嬬墝娓告垙鑽ｈ獕鏌ヨ琛ㄥ崟"""
    user_id: int
    season_key: str = None
