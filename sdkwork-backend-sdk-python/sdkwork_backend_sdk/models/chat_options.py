from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatOptions:
    top_p: float = None
    top_k: int = None
    presence_penalty: float = None
    max_tokens: int = None
    stop_sequences: List[str] = None
    frequency_penalty: float = None
    model: str = None
    temperature: float = None
