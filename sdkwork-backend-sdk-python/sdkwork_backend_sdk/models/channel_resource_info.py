from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChannelResourceInfo:
    items: List[ChannelResourceItem] = None
