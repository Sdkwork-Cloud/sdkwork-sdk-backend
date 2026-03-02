from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusChatOptions:
    stream_usage: bool = None
    model: str = None
    frequency_penalty: float = None
    logit_bias: Dict[str, int] = None
    logprobs: bool = None
    top_logprobs: int = None
    max_tokens: int = None
    max_completion_tokens: int = None
    n: int = None
    modalities: List[str] = None
    audio: AudioParameters = None
    presence_penalty: float = None
    response_format: ResponseFormat = None
    stream_options: StreamOptions = None
    stream: bool = None
    seed: int = None
    stop: List[str] = None
    temperature: float = None
    top_p: float = None
    tools: List[FunctionTool] = None
    tool_choice: Any = None
    user: str = None
    parallel_tool_calls: bool = None
    store: bool = None
    metadata: Dict[str, str] = None
    reasoning_effort: str = None
    verbosity: str = None
    web_search_options: WebSearchOptions = None
