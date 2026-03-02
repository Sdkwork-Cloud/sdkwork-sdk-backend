from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptTemplateMeta:
    payload_url: str = None
    preview_urls: List[str] = None
