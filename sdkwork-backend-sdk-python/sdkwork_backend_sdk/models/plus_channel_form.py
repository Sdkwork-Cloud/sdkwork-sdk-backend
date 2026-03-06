from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusChannelForm:
    """Channel creation form"""
    name: str
    channel: str
    types: List[str] = None
    support_resources: List[str] = None
    status: str
    description: str = None
