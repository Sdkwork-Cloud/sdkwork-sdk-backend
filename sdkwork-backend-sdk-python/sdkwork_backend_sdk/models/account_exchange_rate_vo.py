from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AccountExchangeRateVO:
    """账户兑换比例VO"""
    created_at: str = None
    updated_at: str = None
    config_key: str = None
    points_to_cash_rate: float = None
    remarks: str = None
