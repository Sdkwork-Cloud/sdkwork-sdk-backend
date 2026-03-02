from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCharacterForm:
    """Character creation form"""
    name: str
    type: str
    avatar: ImageMediaResource = None
    three_view_image: ImageMediaResource = None
    grid_shots_image: ImageMediaResource = None
    avatar_video: VideoMediaResource = None
    agent_id: int
    description: str = None
    status: str
    personality: str = None
    background: str = None
    interaction_settings: str = None
    version: str = None
    user_id: int
