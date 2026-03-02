from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipBenefitUsageVO:
    """VIP权益使用记录VO"""
    created_at: str = None
    updated_at: str = None
    user_id: int = None
    benefit_type: str = None
    usage_time: str = None
    usage_count: int = None
    status: int = None
    source_id: int = None
    source_type: str = None
    remark: str = None
