from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiGenerationForm:
    """AI generation creation form"""
    user_id: int = None
    request_id: str
    model: str
    channel: str
    type: str
    cost: float = None
    status: str
