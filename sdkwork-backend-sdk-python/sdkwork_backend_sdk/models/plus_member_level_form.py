from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMemberLevelForm:
    """Member level creation form"""
    card_id: int
    level_name: str
    required_points: int = None
    description: str = None
    status: str
