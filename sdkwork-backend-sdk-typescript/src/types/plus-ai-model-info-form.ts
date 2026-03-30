import type { ModelFunctionInfo } from './model-function-info';
import type { ModelLimitInfo } from './model-limit-info';
import type { ModelMetadata } from './model-metadata';
import type { ModelPrice } from './model-price';
import type { SceneContent } from './scene-content';
import type { TagsContent } from './tags-content';

/** AI model information creation form */
export interface PlusAiModelInfoForm {
  /** Model object ID */
  objectId: string;
  /** Model alias */
  model: string;
  /** Model ID */
  modelId?: string;
  /** Canonical model key */
  modelKey?: string;
  /** Vendor model key */
  vendorModel?: string;
  /** Display name */
  name: string;
  /** Model description */
  description?: string;
  /** Channel */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** Vendor */
  vendor?: 'OPENAI' | 'ANTHROPIC' | 'GOOGLE' | 'META' | 'MICROSOFT' | 'ALIBABA' | 'BAIDU' | 'TENCENT' | 'HUAWEI_CLOUD' | 'IFLYTEK' | 'XAI' | 'AMAZON' | 'ZERO_ONE_AI' | 'ZHIPU_AI' | 'SENSE_TIME' | 'MOONSHOT_AI' | 'DEEPSEEK' | 'MISTRAL_AI' | 'STABILITY_AI' | 'GROQ' | 'HUGGING_FACE' | 'MINIMAX' | 'NVIDIA' | 'OLLAMA' | 'PERPLEXITY' | 'SILICONFLOW' | 'STEPFUN' | 'KUAISHOU';
  /** Model version */
  modelVersion?: string;
  /** Model family */
  family?: string;
  /** Whether the model is open source */
  openSource?: boolean;
  /** API endpoint */
  apiEndpoint?: string;
  /** Model type */
  modelType: 'CHAT' | 'EMBEDDING' | 'IMAGE' | 'TEXT' | 'VIDEO' | 'AUDIO' | 'MUSIC' | 'MODERATION' | 'NEWS' | 'SEARCH' | 'DOCUMENT' | 'CODE' | 'MEMORY' | 'UNKNOWN';
  /** Pricing type */
  pricingType?: 'FREE' | 'PAID' | 'ENTERPRISE';
  /** Lifecycle stage */
  lifecycleStage?: 'PREVIEW' | 'GA' | 'DEPRECATED' | 'EOL';
  /** Release date */
  releaseDate?: string;
  /** Deprecated at */
  deprecatedAt?: string;
  /** Context tokens */
  contextTokens?: number;
  /** Max input tokens */
  maxInputTokens?: number;
  /** Max output tokens */
  maxOutputTokens?: number;
  /** Supports reasoning */
  supportReasoning?: boolean;
  /** Supports multimodal */
  supportMultimodal?: boolean;
  /** Supports function calling */
  supportFunctionCall?: boolean;
  /** Supports structured output */
  supportStructuredOutput?: boolean;
  /** Supports realtime processing */
  supportRealtime?: boolean;
  /** Supports fine-tuning */
  supportFineTuning?: boolean;
  /** Popularity score */
  popularityScore?: number;
  /** Owner */
  ownedBy?: string;
  /** Supported scenes */
  scenes?: SceneContent;
  /** Token limit info */
  tokenLimit?: ModelLimitInfo;
  /** Function info */
  functionInfo?: ModelFunctionInfo;
  /** Price info */
  priceInfo?: ModelPrice;
  /** Metadata */
  metadata?: ModelMetadata;
  /** Product support info */
  productSupportInfo?: Record<string, Record<string, unknown>>;
  /** Supported voices */
  supportedVoices?: string;
  /** Default temperature */
  defaultTemperature?: number;
  /** Default top_p */
  defaultTopP?: number;
  /** Default frequency penalty */
  defaultFrequencyPenalty?: number;
  /** Default presence penalty */
  defaultPresencePenalty?: number;
  /** Model status */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** Usage count */
  usageCount?: number;
  /** Total tokens */
  totalTokens?: number;
  /** Average response time */
  avgResponseTime?: number;
  /** Tags */
  tags?: TagsContent;
  /** Additional config params */
  configParams?: string;
}
