from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LogProbInfo:
    """日志概率信息，包含生成文本的概率分布信息，仅在请求时指定了logprobs参数时返回"""
    tokens: List[str] = None
    token_logprobs: List[float] = None
    text_offset: List[int] = None
