from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerateImageVO:
    """Image generation result value object"""
    created_at: str = None
    updated_at: str = None
    request_id: str = None
    task_id: str = None
    task_status: str = None
    images: ImageMediaResourceList = None
