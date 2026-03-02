from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MsgTextContent:
    """IM文本消息内容类"""
    content: str = None
