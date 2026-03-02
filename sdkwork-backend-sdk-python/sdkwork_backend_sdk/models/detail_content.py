from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DetailContent:
    text: str = None
    contents: Dict[str, str] = None
