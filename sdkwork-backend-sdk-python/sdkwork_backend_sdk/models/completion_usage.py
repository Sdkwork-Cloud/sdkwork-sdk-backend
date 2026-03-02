from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CompletionUsage:
    """完成响应的使用统计信息，包含token使用情况"""
    prompt_tokens: int
    completion_tokens: int
    total_tokens: int
    prompt_cache_hit_tokens: int
    prompt_cache_miss_tokens: int
    prompt_tokens_details: PromptTokensDetails = None
    completion_tokens_details: CompletionTokensDetails = None
