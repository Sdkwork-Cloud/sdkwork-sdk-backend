from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UsageRecordForm:
    """Usage record creation form"""
    user_id: int = None
    request_id: str = None
    model_name: str
    channel: str
    usage_type: str
    billing_type: str
    prompt_tokens: int = None
    completion_tokens: int = None
    cached_tokens: int = None
    total_tokens: int = None
    call_count: int = None
    processing_time: int = None
    image_count: int = None
    image_size: str = None
    video_duration: int = None
    audio_duration: int = None
    cost: float = None
    currency_code: str = None
    status: str
    request_time: str = None
    response_time: str = None
    prompt_id: int = None
    tool_id: int = None
