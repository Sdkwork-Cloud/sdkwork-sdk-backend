from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatOptions:
    model: str = None
    temperature: float = None
    top_p: float = None
    top_k: int = None
    frequency_penalty: float = None
    presence_penalty: float = None
    max_tokens: int = None
    stop_sequences: List[str] = None
