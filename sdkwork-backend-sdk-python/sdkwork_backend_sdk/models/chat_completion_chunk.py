from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatCompletionChunk:
    """聊天完成Stream方式的响应对象，用于流式传输的聊天模型响应"""
    id: str
    object: str
    created: int
    model: str
    choices: List[ChatCompletionChunkChoice]
    usage: CompletionUsage = None
    metadata: ChatCompletionMetadata = None
    content: str = None
    agent: PlusAgent = None
    reasoning_content: str = None
    system_fingerprint: str = None
