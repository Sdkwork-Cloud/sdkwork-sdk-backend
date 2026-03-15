from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileContentObject:
    schema_version: str = None
    source: str = None
    text: str = None
    contents: Dict[str, str] = None
    metadata: Dict[str, Any] = None
    generation: GenerationContext = None
    segments: List[ContentSegment] = None
    references: List[AssetReference] = None
