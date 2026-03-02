from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiModelInfoForm:
    """AI model information creation form"""
    object_id: str
    model: str
    name: str
    description: str = None
    channel: str = None
    model_version: str = None
    family: str = None
    api_endpoint: str = None
    model_type: str
    created_at: int = None
    owned_by: str = None
    token_limit: ModelLimitInfo = None
    price_info: ModelPrice = None
    metadata: ModelMetadata = None
    supported_voices: str = None
    default_temperature: float = None
    default_top_p: float = None
    default_frequency_penalty: float = None
    default_presence_penalty: float = None
    status: str = None
    usage_count: int = None
    total_tokens: int = None
    avg_response_time: int = None
    tags: TagsContent = None
    config_params: str = None
