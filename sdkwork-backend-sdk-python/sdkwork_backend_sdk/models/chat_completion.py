from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatCompletion:
    """大模型的聊天完成响应结果"""
    id: str
    object: str
    created: int
    model: str
    choices: List[ChatCompletionChoice]
    usage: CompletionUsage = None
    metadata: ChatCompletionMetadata = None
    content: str = None
    agent: PlusAgent = None
    system_fingerprint: str = None
