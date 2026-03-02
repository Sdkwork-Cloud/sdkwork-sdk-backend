from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MsgAudioContent:
    """IM音频消息内容类"""
    content: str = None
    resource: AudioMediaResource = None
