from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoShotItem:
    """Video shot item"""
    id: str = None
    uuid: str = None
    shot_prompt: str = None
    dialogue: str = None
    duration: float = None
    start_frame: ImageMediaResource = None
    end_frame: ImageMediaResource = None
    image: ImageMediaResource = None
    resource_list: AssetMediaResourceList = None
    emotion: str = None
    video_description: str = None
    video: VideoMediaResource = None
