from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UseTool:
    id: int = None
    name: str = None
    description: str = None
    enable: bool = None
