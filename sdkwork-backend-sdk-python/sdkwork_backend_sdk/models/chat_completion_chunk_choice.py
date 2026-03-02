from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatCompletionChunkChoice:
    """流式聊天完成响应中的选项对象，包含模型生成的响应内容块"""
    index: int
    delta: ChatCompletionChunkDelta = None
    logprobs: LogProbInfo = None
    finish_reason: str = None
