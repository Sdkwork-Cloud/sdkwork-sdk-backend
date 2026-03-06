from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusChannelProxyForm:
    """Channel proxy creation form"""
    name: str
    channel: str
    proxy: str
    default_model: str = None
    status: str
    description: str = None
