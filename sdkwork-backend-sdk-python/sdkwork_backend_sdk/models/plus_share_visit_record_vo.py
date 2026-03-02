from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusShareVisitRecordVO:
    """分享访问记录Value Object"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    share_id: int = None
    ip_address: str = None
    user_agent: str = None
    accessed_at: str = None
    success: bool = None
