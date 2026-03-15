from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AccountExchangeRateUpdateForm:
    """Account exchange rate update form"""
    points_to_cash_rate: float
    remarks: str = None
