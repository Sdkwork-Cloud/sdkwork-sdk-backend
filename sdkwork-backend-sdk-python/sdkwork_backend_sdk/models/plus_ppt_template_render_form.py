from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptTemplateRenderForm:
    """PPT template rendering parameters including template ID, dynamic data and theme settings"""
    id: int = None
    uuid: str = None
    prompt: str = None
