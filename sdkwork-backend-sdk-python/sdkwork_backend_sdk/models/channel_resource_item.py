from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChannelResourceItem:
    type: str = None
    functions: List[str] = None
