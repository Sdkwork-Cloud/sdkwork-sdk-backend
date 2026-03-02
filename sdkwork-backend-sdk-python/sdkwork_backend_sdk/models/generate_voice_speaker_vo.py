from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerateVoiceSpeakerVO:
    """语音说话人生成结果VO"""
    created_at: str = None
    updated_at: str = None
    request_id: str = None
    task_id: str = None
    task_status: str = None
    voice_resources: AudioMediaResourceList = None
    voice_speaker_id: str = None
    voice_speaker_name: str = None
    voice_type: str = None
    voice_style: str = None
    model: str = None
    duration: int = None
    error_message: str = None
