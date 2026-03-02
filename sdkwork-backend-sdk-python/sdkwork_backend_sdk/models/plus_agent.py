from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAgent:
    name: str = None
    id: int = None
    definition: AgentDefinition = None
    uuid: str = None
    next_actions: List[str] = None
    chat_memory: IPlusChatMemory = None
    execution_context: AgentExecutionContext = None
    account_config: LlmAccountConfig = None
    tool_callback_provider: ToolCallbackProvider = None
    prompt_context_optimizer: PromptContextOptimizer = None
    prompt_path: str = None
    description: str = None
    metadata: AgentMetadata = None
    face_url: str = None
    prompts: Dict[str, Prompt] = None
    system_prompt: Prompt = None
    instructions: List[str] = None
    chat_options: ChatOptions = None
    chat_context: ChatContext = None
    tools: List[PromptToolDescription] = None
