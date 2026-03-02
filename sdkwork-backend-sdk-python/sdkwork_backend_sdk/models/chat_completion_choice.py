from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatCompletionChoice:
    """聊天完成响应中的选项对象"""
    index: int
    message: ChatCompletionMessage
    logprobs: LogProbInfo = None
    finish_reason: str
