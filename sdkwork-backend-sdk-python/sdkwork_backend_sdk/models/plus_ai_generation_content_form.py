from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiGenerationContentForm:
    """AI generated content creation form"""
    title: str = None
    description: str = None
    content_type: str
    content_id: int = None
    metadata: Dict[str, Any] = None
    content_url: str = None
    file_size: int = None
    content_format: str = None
