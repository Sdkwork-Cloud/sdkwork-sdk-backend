from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusShareVisitRecordForm:
    """Visit record creation form"""
    share_id: int
    ip_address: str = None
    user_agent: str = None
    accessed_at: str
    success: bool = None
