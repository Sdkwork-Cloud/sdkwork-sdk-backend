from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Message:
    message_type: str = None
    text: str = None
    metadata: Dict[str, Any] = None
