from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MsgImageContent:
    """IM图片消息内容类"""
    content: str = None
    resource: ImageMediaResource = None
