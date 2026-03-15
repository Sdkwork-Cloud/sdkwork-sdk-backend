from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Prompt:
    contents: str = None
    options: ChatOptions = None
    instructions: List[Message] = None
    last_user_or_tool_response_message: Message = None
    user_messages: List[UserMessage] = None
    user_message: UserMessage = None
    system_messages: List[SystemMessage] = None
    system_message: SystemMessage = None
