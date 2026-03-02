from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Function:
    description: str = None
    name: str = None
    parameters: Dict[str, Any] = None
    strict: bool = None
