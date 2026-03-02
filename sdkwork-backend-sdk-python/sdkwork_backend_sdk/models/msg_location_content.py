from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MsgLocationContent:
    """IM位置消息内容类"""
    content: str = None
    location: GeoPoint = None
    address: str = None
    name: str = None
    radius: float = None
