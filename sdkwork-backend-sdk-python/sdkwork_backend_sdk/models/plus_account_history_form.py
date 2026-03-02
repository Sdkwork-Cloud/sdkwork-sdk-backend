from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAccountHistoryForm:
    """Account history creation form"""
    asset_type: str
    account_id: int
    transaction_id: str
    transaction_type: str
    amount: float = None
    balance_before: float = None
    balance_after: float = None
    related_account_id: int = None
    points_change: int = None
    points_before: int = None
    points_after: int = None
    source_type: str = None
    source_id: str = None
    expired_at: str = None
    status: str
    remarks: str = None
