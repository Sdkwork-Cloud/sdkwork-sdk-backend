import type { ChatResponseHandler } from './chat-response-handler';
import type { PlusChatOptions } from './plus-chat-options';
import type { ShardingContext } from './sharding-context';

export interface ChatContext {
  indent?: string;
  responseHandler?: ChatResponseHandler;
  sharding_context?: ShardingContext;
  conversation_id?: string;
  conversation_uuid?: string;
  user_id?: number;
  knowledge_base_id?: number;
  agent_id?: number;
  flow_id?: number;
  datasource_id?: number;
  parent_message_id?: number;
  save_audio?: boolean;
  modalities?: string[];
  chat_options?: PlusChatOptions;
  response_channels?: 'DINGTALK' | 'DISCORD' | 'FEISHU' | 'KAKAOTALK' | 'LINE' | 'MICROSOFT_TEAMS' | 'OPENIM' | 'SLACK' | 'TELEGRAM' | 'WECHAT_OFFICIAL_ACCOUNT' | 'WECHAT_WORK' | 'WECHAT_KF' | 'WHATSAPP' | 'WUKONG_IM' | 'XIAOZHI' | 'MQTT' | 'SDKWORK'[];
}
