from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerateCharacterVO:
    """角色生成结果VO"""
    created_at: str = None
    updated_at: str = None
    request_id: str = None
    task_id: str = None
    task_status: str = None
    character_images: List[ImageMediaResource] = None
    character_id: str = None
    character_name: str = None
    character_description: str = None
    model: str = None
    duration: int = None
    error_message: str = None
