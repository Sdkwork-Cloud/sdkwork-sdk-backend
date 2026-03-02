from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCharacterVO:
    """虚拟角色VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    name: str = None
    type: str = None
    avatar: ImageMediaResource = None
    three_view_image: ImageMediaResource = None
    grid_shots_image: ImageMediaResource = None
    avatar_video: VideoMediaResource = None
    agent_id: int = None
    description: str = None
    status: str = None
    personality: str = None
    background: str = None
    interaction_settings: str = None
    version: str = None
    user_id: int = None
