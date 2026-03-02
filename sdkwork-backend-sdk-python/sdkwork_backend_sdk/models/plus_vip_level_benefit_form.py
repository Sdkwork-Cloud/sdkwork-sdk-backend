from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipLevelBenefitForm:
    """VIP level benefit creation form"""
    vip_level_id: int
    benefit_id: int
    daily_limit: int = None
    monthly_limit: int = None
    total_limit: int = None
    status: str
    metadata: VipLevelBenefitMetadata = None
    remark: str = None
