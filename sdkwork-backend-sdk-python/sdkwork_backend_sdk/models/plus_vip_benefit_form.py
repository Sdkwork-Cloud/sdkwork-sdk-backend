from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipBenefitForm:
    """VIP benefit creation form"""
    name: str
    description: str = None
    benefit_key: str
    type: str
