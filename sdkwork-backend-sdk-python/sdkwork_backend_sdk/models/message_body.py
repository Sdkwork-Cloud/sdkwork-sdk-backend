from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MessageBody:
    id: str = None
    completion: ChatCompletion = None
    payload: MsgPayload = None
    chunk: ChatCompletionChunk = None
    audio_frame: AudioMediaResource = None
    group_infos: Dict[str, GroupInfo] = None
    groups: Dict[str, List[ChatCompletionChunk]] = None
    think_start: int = None
    think_end: int = None
    state: ChatState = None
