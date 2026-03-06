from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AgentExecutionContext:
    id: str = None
    biz_type: str = None
    uuid: str = None
    max_flow_steps: int = None
    flow_steps: int = None
    threads: int = None
    create_at: str = None
    max_duration: int = None
    listeners: List[ChatMessageListener] = None
    state: str = None
    chat_context: ChatContext = None
    sharding_context: ShardingContext = None
    flow: Flow = None
    root: AgentExecutionContext = None
    parent: AgentExecutionContext = None
    pre: PlusAgent = None
    current: PlusAgent = None
    response_handler: ChatResponseHandler = None
    project: PlusProjectObject = None
    disk: PlusDiskObject = None
    disk_root_file: PlusFileObject = None
    completed: bool = None
    running: bool = None
    paused: bool = None
    expired: bool = None
    failed: bool = None
    waiting: bool = None
    init: bool = None
    end: bool = None
    agent_scopes: Dict[str, AgentScope] = None
    over_steps: bool = None
