from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PromptToolDescription:
    id: str = None
    name: str = None
    description: str = None
