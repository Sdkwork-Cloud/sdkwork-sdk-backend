from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatState:
    content: str = None
    reasoning_content: str = None
    thinking: bool = None
