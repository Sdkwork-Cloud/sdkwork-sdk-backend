from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatCompletionCreateForm:
    """Chat completion create form"""
    model: str = None
    messages: List[ChatCompletionMessage] = None
    temperature: float = None
    n: int = None
    stream: bool = None
    stop: List[str] = None
    user: str = None
    tool: str = None
    top_p: float = None
    max_tokens: int = None
    presence_penalty: float = None
    frequency_penalty: float = None
    logit_bias: Dict[str, int] = None
    response_format: bool = None
    system_fingerprint: str = None
    chat_context: ChatContext = None
