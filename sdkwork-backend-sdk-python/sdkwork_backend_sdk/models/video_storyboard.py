from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoStoryboard:
    """Video storyboard"""
    shots: List[VideoShotItem] = None
    final_video: VideoMediaResource = None
    final_audio: AudioMediaResource = None
    title: str = None
    description: str = None
    style: str = None
    aspect_ratio: str = None
    prompt: str = None
    duration: float = None
    speaker: VoiceSpeakerInfo = None
