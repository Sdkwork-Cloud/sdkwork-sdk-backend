from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipLevelBenefitMetadata:
    max_usage_count: int = None
    max_daily_usage: int = None
    max_monthly_usage: int = None
    is_unlimited: bool = None
    valid_period: str = None
    extend_info: str = None
