from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipBenefitUsageForm:
    """VIP benefit usage creation form"""
    user_id: int
    benefit_type: str
    usage_time: str
    usage_count: int
    status: int
    source_id: int = None
    source_type: str = None
    remark: str = None
