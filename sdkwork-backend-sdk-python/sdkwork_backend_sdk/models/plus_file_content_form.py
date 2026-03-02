from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusFileContentForm:
    """File content creation form"""
    file_id: int
    file_uuid: str
    prompt: str = None
    encoding: str = None
    content: FileContentObject = None
