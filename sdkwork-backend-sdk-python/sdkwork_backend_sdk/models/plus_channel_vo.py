from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusChannelVO:
    """Channel VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    user_id: int = None
    name: str = None
    channel: str = None
    types: List[str] = None
    support_resources: List[str] = None
    status: str = None
    description: str = None
