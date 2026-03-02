from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiGenerationContentVO:
    """AI生成内容详情VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    version: int = None
    title: str = None
    description: str = None
    content_type: str = None
    content_id: int = None
    metadata: Dict[str, Any] = None
    input_params: GenerationInputParams = None
    output: GenerationOutput = None
    content_format: str = None
    content_url: str = None
    file_size: int = None
