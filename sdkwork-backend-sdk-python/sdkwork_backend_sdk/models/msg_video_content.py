from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MsgVideoContent:
    """IM视频消息内容类"""
    content: str = None
    resource: VideoMediaResource = None
