from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipBenefitVO:
    """VIP权益定义VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    description: str = None
    benefit_key: str = None
    type: str = None
