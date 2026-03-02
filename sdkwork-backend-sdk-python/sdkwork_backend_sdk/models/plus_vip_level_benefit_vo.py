from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipLevelBenefitVO:
    """VIP等级权益关联VO"""
    created_at: str = None
    updated_at: str = None
    vip_level_id: int = None
    benefit_id: int = None
    daily_limit: int = None
    monthly_limit: int = None
    total_limit: int = None
    status: str = None
    metadata: VipLevelBenefitMetadata = None
    remark: str = None
