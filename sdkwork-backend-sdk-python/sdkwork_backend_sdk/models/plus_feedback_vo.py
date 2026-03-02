from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusFeedbackVO:
    """反馈信息VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    version: int = None
    user_id: int = None
