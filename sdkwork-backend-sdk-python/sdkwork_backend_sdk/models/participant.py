from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Participant:
    """消息参与者实体类"""
    id: int = None
    uuid: str = None
    open_id: str = None
    union_id: str = None
    name: str = None
    face: ImageMediaResource = None
    device_id: int = None
    device_uuid: str = None
    device: bool = None
