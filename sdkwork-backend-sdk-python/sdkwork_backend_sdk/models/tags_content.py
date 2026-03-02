from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TagsContent:
    tags: List[str] = None
    children: List[TagsContent] = None
