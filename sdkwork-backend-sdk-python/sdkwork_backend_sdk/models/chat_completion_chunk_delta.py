from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatCompletionChunkDelta:
    """聊天消息对象，包含消息的角色、内容和工具调用信息"""
    role: str
    content: str
    audio: ChatCompletionAudio = None
    reasoning_content: str = None
    tool_calls: List[ChatCompletionMessageToolCall] = None
