from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiGenerationVO:
    """AI Generation VO"""
    id: int = None
    uuid: str = None
    user_id: int = None
    title: str = None
    request_id: str = None
    type: str = None
    model: str = None
    channel: str = None
    input_params: GenerationInput = None
    output_result: GenerationOutput = None
    status: str = None
    progress: int = None
    channel_task_id: str = None
    channel_task_status: str = None
    cost: float = None
    error_code: str = None
    error_message: str = None
    retry_count: int = None
    max_retry: int = None
    started_at: str = None
    completed_at: str = None
    conversation_id: int = None
    message_id: int = None
    parent_id: int = None
    batch_id: str = None
    created_at: str = None
    updated_at: str = None
