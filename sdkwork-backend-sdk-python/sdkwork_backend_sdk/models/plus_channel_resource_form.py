from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusChannelResourceForm:
    """Channel resource creation form"""
    resource: str
    channel: str
    channel_account_id: int
