from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserCardForm:
    """User-card binding creation form"""
    user_id: int
    card_id: int
    card_code: str
    acquire_time: str
    activate_time: str = None
    cancel_time: str = None
    points: int = None
    balance: int = None
