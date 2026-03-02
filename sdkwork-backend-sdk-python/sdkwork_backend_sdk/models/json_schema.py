from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class JsonSchema:
    name: str = None
    schema: Dict[str, Any] = None
    strict: bool = None
