from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipLevelVO:
    """VIP等级VO，包含VIP等级的基本信息及权益ID集合"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    level_value: int = None
    required_points: int = None
    description: str = None
    benefit_ids: List[int] = None
    benefits: List[PlusVipBenefitVO] = None
