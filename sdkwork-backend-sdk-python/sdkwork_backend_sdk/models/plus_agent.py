from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAgent:
    name: str = None
    id: int = None
    definition: AgentDefinition = None
    description: str = None
    metadata: AgentMetadata = None
    uuid: str = None
    system_prompt: Prompt = None
    account_config: LlmAccountConfig = None
    tools: List[PromptToolDescription] = None
    execution_context: AgentExecutionContext = None
    chat_context: ChatContext = None
    chat_options: ChatOptions = None
    instructions: List[str] = None
    face_url: str = None
    prompts: Dict[str, Prompt] = None
    tool_callback_provider: ToolCallbackProvider = None
    prompt_path: str = None
    prompt_context_optimizer: PromptContextOptimizer = None
    next_actions: List[str] = None
    chat_memory: IPlusChatMemory = None
