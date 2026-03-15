from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiModelInfoForm:
    """AI model information creation form"""
    object_id: str
    model: str
    model_id: str = None
    model_key: str = None
    vendor_model: str = None
    name: str
    description: str = None
    channel: str = None
    vendor: str = None
    model_version: str = None
    family: str = None
    open_source: bool = None
    api_endpoint: str = None
    model_type: str
    pricing_type: str = None
    lifecycle_stage: str = None
    release_date: str = None
    deprecated_at: str = None
    context_tokens: int = None
    max_input_tokens: int = None
    max_output_tokens: int = None
    support_reasoning: bool = None
    support_multimodal: bool = None
    support_function_call: bool = None
    support_structured_output: bool = None
    support_realtime: bool = None
    support_fine_tuning: bool = None
    popularity_score: int = None
    owned_by: str = None
    scenes: SceneContent = None
    token_limit: ModelLimitInfo = None
    function_info: ModelFunctionInfo = None
    price_info: ModelPrice = None
    metadata: ModelMetadata = None
    product_support_info: Dict[str, Any] = None
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
