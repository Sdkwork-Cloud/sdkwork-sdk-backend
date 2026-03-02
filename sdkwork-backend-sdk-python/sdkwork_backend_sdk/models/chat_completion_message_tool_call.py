from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatCompletionMessageToolCall:
    """工具调用对象，包含工具调用的唯一标识、类型和具体函数调用信息"""
    id: str
    type: str
    function: FunctionCall
