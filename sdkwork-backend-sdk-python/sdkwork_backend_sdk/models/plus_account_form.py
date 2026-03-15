from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAccountForm:
    """Account creation form"""
    account_type: str
    user_id: int
    available_balance: float = None
    frozen_balance: float = None
    available_points: int = None
    frozen_points: int = None
    status: str
