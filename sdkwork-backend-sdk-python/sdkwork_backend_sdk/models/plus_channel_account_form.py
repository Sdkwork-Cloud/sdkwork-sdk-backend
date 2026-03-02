from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusChannelAccountForm:
    """Channel account creation form"""
    name: str
    channel: str
    configs: ChannelConfigInfo = None
    status: str
    description: str = None
