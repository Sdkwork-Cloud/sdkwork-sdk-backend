from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AccountExchangeRateUpdateForm:
    """账户兑换比例更新表单"""
    points_to_cash_rate: float
    remarks: str = None
