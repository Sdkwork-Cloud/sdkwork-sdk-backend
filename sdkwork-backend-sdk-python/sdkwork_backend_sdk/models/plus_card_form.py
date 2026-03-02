from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCardForm:
    """Membership card creation form"""
    card_organization_id: int
    card_type: str
    code_type: str
    title: str
    brand_name: str
    logo_url: str = None
    notice: str = None
    description: str = None
    color: str = None
    quantity: int = None
    get_limit: int = None
    can_share: bool = None
    can_give_friend: bool = None
    start_time: str
    end_time: str
    status: str
