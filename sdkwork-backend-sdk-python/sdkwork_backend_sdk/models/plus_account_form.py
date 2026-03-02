from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAccountForm:
    """Account creation form"""
    user_id: int
    available_balance: float
    frozen_balance: float
    available_points: int
    frozen_points: int
    status: str
