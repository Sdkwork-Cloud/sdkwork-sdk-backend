from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GroupInfo:
    id: str = None
    object: str = None
    created: int = None
    model: str = None
    system_fingerprint: str = None
    metadata: ChatCompletionMetadata = None
    agent: PlusAgent = None
