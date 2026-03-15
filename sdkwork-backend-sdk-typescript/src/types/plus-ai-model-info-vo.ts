import type { ModelFunctionInfo } from './model-function-info';
import type { ModelLimitInfo } from './model-limit-info';
import type { ModelMetadata } from './model-metadata';
import type { ModelPrice } from './model-price';
import type { SceneContent } from './scene-content';
import type { TagsContent } from './tags-content';

/** Enhanced AI Model Information Value Object */
export interface PlusAiModelInfoVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 模型标ID */
  objectId?: string;
  /** 模型标识符(如"gpt-4","claude-3-opus") */
  model?: string;
  /** 模型ID */
  modelId?: string;
  /** 规范化模型键 */
  modelKey?: string;
  /** 厂商原始模型键 */
  vendorModel?: string;
  /** 模型显示名称(如"GPT-4","Claude 3 Opus") */
  name?: string;
  /** 模型描述 */
  description?: string;
  /** 模型提供商(如"OpenAI","Anthropic","Hugging Face") */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** 模型厂商 */
  vendor?: 'OPENAI' | 'ANTHROPIC' | 'GOOGLE' | 'META' | 'MICROSOFT' | 'ALIBABA' | 'BAIDU' | 'TENCENT' | 'HUAWEI_CLOUD' | 'IFLYTEK' | 'XAI' | 'AMAZON' | 'ZERO_ONE_AI' | 'ZHIPU_AI' | 'SENSE_TIME' | 'MOONSHOT_AI' | 'DEEPSEEK' | 'MISTRAL_AI' | 'STABILITY_AI' | 'GROQ' | 'HUGGING_FACE' | 'MINIMAX' | 'NVIDIA' | 'OLLAMA' | 'PERPLEXITY' | 'SILICONFLOW' | 'STEPFUN' | 'KUAISHOU';
  /** 模型版本(如"1.0","2023-05-15") */
  modelVersion?: string;
  /** 模型系列(如"GPT","Claude","Llama") */
  family?: string;
  /** 模型API端点URL */
  apiEndpoint?: string;
  /** 模型类型(TEXT:文本,IMAGE:图像,VIDEO:视频,AUDIO:音频) */
  modelType?: 'CHAT' | 'EMBEDDING' | 'IMAGE' | 'TEXT' | 'VIDEO' | 'AUDIO' | 'MUSIC' | 'MODERATION' | 'NEWS' | 'SEARCH' | 'DOCUMENT' | 'CODE' | 'MEMORY' | 'UNKNOWN';
  /** 定价类型 */
  pricingType?: 'FREE' | 'PAID' | 'ENTERPRISE';
  /** 生命周期阶段 */
  lifecycleStage?: 'PREVIEW' | 'GA' | 'DEPRECATED' | 'EOL';
  /** 发布日期 */
  releaseDate?: string;
  /** 废弃时间 */
  deprecatedAt?: string;
  /** 上下文token数量 */
  contextTokens?: number;
  /** 最大输入token */
  maxInputTokens?: number;
  /** 最大输出token */
  maxOutputTokens?: number;
  /** 支持推理 */
  supportReasoning?: boolean;
  /** 支持多模态 */
  supportMultimodal?: boolean;
  /** 支持函数调用 */
  supportFunctionCall?: boolean;
  /** 支持结构化输出 */
  supportStructuredOutput?: boolean;
  /** 支持实时能力 */
  supportRealtime?: boolean;
  /** 支持微调 */
  supportFineTuning?: boolean;
  /** 热度分值 */
  popularityScore?: number;
  /** 模型所有者/组织 */
  ownedBy?: string;
  /** 支持场景 */
  scenes?: SceneContent;
  /** 模型令牌限制信息 */
  tokenLimit?: ModelLimitInfo;
  /** 模型功能信息 */
  functionInfo?: ModelFunctionInfo;
  /** 模型价格信息 */
  priceInfo?: ModelPrice;
  /** 模型元数据及能力信息 */
  metadata?: ModelMetadata;
  /** 产品支持信息 */
  productSupportInfo?: Record<string, unknown>;
  /** 支持的语音列表(用于文本转语音模型) */
  supportedVoices?: string;
  /** 默认温度设置 */
  defaultTemperature?: number;
  /** 默认top_p设置 */
  defaultTopP?: number;
  /** 默认频率惩罚值 */
  defaultFrequencyPenalty?: number;
  /** 默认存在惩罚值 */
  defaultPresencePenalty?: number;
  /** 模型状态(active:活跃,deprecated:已弃用) */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** 总使用次数 */
  usageCount?: number;
  /** 处理的总令牌数 */
  totalTokens?: number;
  /** 平均响应时间(毫秒) */
  avgResponseTime?: number;
  /** 模型标签(逗号分隔) */
  tags?: TagsContent;
  /** 附加配置参数(JSON格式) */
  configParams?: string;
}
