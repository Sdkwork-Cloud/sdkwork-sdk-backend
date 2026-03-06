from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MimeType:
    type: str = None
    subtype: str = None
    parameters: Dict[str, str] = None
    charset: str = None
    concrete: bool = None
    subtype_suffix: str = None
    wildcard_type: bool = None
    wildcard_subtype: bool = None
