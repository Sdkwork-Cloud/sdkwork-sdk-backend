from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusChannelAccountQueryForm:
    """Query form with optional filters"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    channel: str
    status: str
    resource_type: str = None
    resource_types: List[str] = None
