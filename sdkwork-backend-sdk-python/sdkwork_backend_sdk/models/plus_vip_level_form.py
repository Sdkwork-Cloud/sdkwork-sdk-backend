from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipLevelForm:
    """VIP level creation form"""
    name: str
    level_value: int
    required_points: int
    description: str = None
