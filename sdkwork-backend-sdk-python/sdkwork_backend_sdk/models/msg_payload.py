from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MsgPayload:
    """IM消息载体类"""
    audio: MsgAudioContent = None
    file: MsgFileContent = None
    image: MsgImageContent = None
    location: MsgLocationContent = None
    music: MsgMusicContent = None
    text: MsgTextContent = None
    video: MsgVideoContent = None
