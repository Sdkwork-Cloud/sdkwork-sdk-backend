from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MsgMusicContent:
    """IM音乐消息内容类"""
    content: str = None
    resource: MusicMediaResource = None
    title: str = None
    artist: str = None
    album: str = None
    duration: int = None
