from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UsageRecordVO:
    """AI模型使用记录VO，用于记录各种AI模型调用的使用情况"""
    created_at: str = None
    updated_at: str = None
    user_id: int = None
    request_id: str = None
    model_name: str = None
    channel: str = None
    usage_type: str = None
    billing_type: str = None
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
    status: str = None
    request_time: str = None
    response_time: str = None
    prompt_id: int = None
    tool_id: int = None
