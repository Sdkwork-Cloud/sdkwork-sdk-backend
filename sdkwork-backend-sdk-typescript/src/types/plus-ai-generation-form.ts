import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { AuthorInfo } from './author-info';
import type { ImageMediaResourceList } from './image-media-resource-list';
import type { TagsContent } from './tags-content';
import type { VideoStoryboard } from './video-storyboard';

/** AI generation creation form */
export interface PlusAiGenerationForm {
  /** 用户ID */
  userId?: number;
  /** 请求ID(用于跟踪和关联请求) */
  requestId?: string;
  /** 模型名称 */
  model: string;
  /** 服务提供商 */
  channel: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** 生成类型 */
  type: 'DEFAULT' | 'IMAGE' | 'VIDEO' | 'SPEECH' | 'MUSIC' | 'MODEL_3D' | 'CODE' | 'DOCUMENT' | 'PPT' | 'VIDEO_AUTO_SLICE' | 'VOICE_SPEAKER' | 'CHARACTER' | 'AUDIO_EFFECT' | 'FILM' | 'OTHER';
  /** 封面图片URL列表 */
  coverImages?: ImageMediaResourceList;
  /** 媒体资源列表 */
  resourceList?: AssetMediaResourceList;
  /** 视频故事板 */
  storyboard?: VideoStoryboard;
  /** 作者信息 */
  author?: AuthorInfo;
  /** 标签内容 */
  tags?: TagsContent;
  /** 提示词ID */
  promptId?: number;
  /** 第三方通道任务ID */
  channelTaskId?: string;
  /** 通道任务状态 */
  channelTaskStatus?: 'PENDING' | 'RUNNING' | 'SUCCEEDED' | 'FAILED' | 'CANCELED' | 'UNKNOWN';
  /** 任务创建时间 */
  taskCreatedTime?: string;
  /** 任务更新时间 */
  taskUpdatedTime?: string;
  /** 实际费用 */
  cost?: number;
  /** 任务状态 */
  status: 'DEFAULT' | 'PENDING' | 'PROCESSING' | 'SUCCESS' | 'FAILED' | 'CANCELLED' | 'DRAFT';
  /** 请求时间 */
  requestTime?: string;
  /** 响应时间 */
  responseTime?: string;
  /** 关联的使用记录ID */
  usageRecordId?: number;
  /** 关联的会话ID */
  conversationId?: number;
  /** 关联的消息ID */
  messageId?: number;
}
