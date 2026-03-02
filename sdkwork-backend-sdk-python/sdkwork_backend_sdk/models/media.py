from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Media:
    id: str = None
    mime_type: MimeType = None
    data: Any = None
    name: str = None
    data_as_byte_array: str = None
