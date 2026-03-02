from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusChannelResourceVO:
    """Channel Resource VO (Manages resources associated with communication channels, including type and provider mappings)"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    resource: str = None
    channel: str = None
    channel_account_id: int = None
