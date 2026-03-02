import type { GenerationInput } from './generation-input';
import type { GenerationOutput } from './generation-output';

/** AI Generation VO */
export interface PlusAiGenerationVO {
  /** ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** User ID */
  userId?: number;
  /** Title */
  title?: string;
  /** Request ID */
  requestId?: string;
  /** Generation type */
  type?: 'DEFAULT' | 'IMAGE' | 'VIDEO' | 'SPEECH' | 'MUSIC' | 'MODEL_3D' | 'CODE' | 'DOCUMENT' | 'PPT' | 'VIDEO_AUTO_SLICE' | 'VOICE_SPEAKER' | 'CHARACTER' | 'AUDIO_EFFECT' | 'FILM' | 'OTHER';
  /** Model */
  model?: string;
  /** Channel */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** Input params */
  inputParams?: GenerationInput;
  /** Output result */
  outputResult?: GenerationOutput;
  /** Status */
  status?: 'DEFAULT' | 'PENDING' | 'PROCESSING' | 'SUCCESS' | 'FAILED' | 'CANCELLED' | 'DRAFT';
  /** Progress */
  progress?: number;
  /** Channel task ID */
  channelTaskId?: string;
  /** Channel task status */
  channelTaskStatus?: 'PENDING' | 'RUNNING' | 'SUCCEEDED' | 'FAILED' | 'CANCELED' | 'UNKNOWN';
  /** Cost */
  cost?: number;
  /** Error code */
  errorCode?: string;
  /** Error message */
  errorMessage?: string;
  /** Retry count */
  retryCount?: number;
  /** Max retry */
  maxRetry?: number;
  /** Started at */
  startedAt?: string;
  /** Completed at */
  completedAt?: string;
  /** Conversation ID */
  conversationId?: number;
  /** Message ID */
  messageId?: number;
  /** Parent ID */
  parentId?: number;
  /** Batch ID */
  batchId?: string;
  /** Created at */
  createdAt?: string;
  /** Updated at */
  updatedAt?: string;
}
