from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiModelInfoQueryListForm:
    """AI model list query form"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    keyword: str = None
    channel: str = None
    model_type: str = None
    status: str = None
    family: str = None
    vendor: str = None
    open_source: bool = None
    pricing_type: str = None
    lifecycle_stage: str = None
    min_context_tokens: int = None
    support_reasoning: bool = None
    support_multimodal: bool = None
    support_function_call: bool = None
    support_realtime: bool = None
    support_fine_tuning: bool = None
