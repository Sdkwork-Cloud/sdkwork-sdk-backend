from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SystemMessage:
    message_type: str = None
    metadata: Dict[str, Any] = None
    text: str = None
