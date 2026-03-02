from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AiAgentSystemPrompt:
    title: str = None
    content: str = None
