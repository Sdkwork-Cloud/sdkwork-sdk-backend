from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserMessage:
    message_type: str = None
    metadata: Dict[str, Any] = None
    media: List[Media] = None
    text: str = None
