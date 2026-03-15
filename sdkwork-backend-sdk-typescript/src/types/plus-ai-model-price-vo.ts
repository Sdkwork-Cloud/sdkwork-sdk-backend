/** AI模型价格VO */
export interface PlusAiModelPriceVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 模型标ID */
  objectId?: string;
  /** 模型标识符(如"gpt-4","claude-3-opus") */
  model?: string;
  /** 模型主键ID */
  modelId?: number;
  /** 渠道 */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** 规范化模型键 */
  modelKey?: string;
  /** 产品编码 */
  productCode?: string;
  /** 功能编码 */
  featureCode?: string;
  /** 计费类型 */
  billingType?: 'TOKEN' | 'REQUEST' | 'DURATION' | 'CHARACTER' | 'IMAGE' | 'VIDEO_SECOND' | 'AUDIO_SECOND' | 'STORAGE_MB' | 'TIERED' | 'SUBSCRIPTION' | 'FREE';
  /** 价格项类型 */
  priceItemType?: 'INPUT' | 'BATCH_INPUT' | 'CACHED_INPUT' | 'BATCH_CACHED_INPUT' | 'OUTPUT' | 'BATCH_OUTPUT' | 'COUNT' | 'DURATION';
  /** 档位名称 */
  tierName?: string;
  /** 规则优先级 */
  rulePriority?: number;
  /** 价格计量单位 */
  unit?: 'TOKEN' | 'K_TOKEN' | 'M_TOKEN' | 'COUNT' | 'DURATION';
  /** 计量单位大小 */
  unitSize?: number;
  /** 基础价格 */
  price?: number;
  /** 输入价格 */
  inputPrice?: number;
  /** 批量输入价格 */
  batchInputPrice?: number;
  /** 缓存输入价格 */
  cachedInputPrice?: number;
  /** 批量缓存输入价格 */
  batchCachedInputPrice?: number;
  /** 输出价格 */
  outputPrice?: number;
  /** 批量输出价格 */
  batchOutputPrice?: number;
  /** 货币类型 */
  currency?: 'USD' | 'EUR' | 'GBP' | 'JPY' | 'AUD' | 'CAD' | 'CHF' | 'CNY' | 'SEK' | 'NZD' | 'BRL' | 'INR' | 'RUB' | 'ZAR' | 'SGD' | 'HKD' | 'KRW' | 'MXN' | 'TRY' | 'ILS' | 'POINT' | 'TOKEN';
  /** 最小使用量 */
  minUsage?: number;
  /** 最大使用量 */
  maxUsage?: number;
  /** 生效开始时间 */
  effectiveFrom?: string;
  /** 生效结束时间 */
  effectiveTo?: string;
  /** 是否默认规则 */
  defaultRule?: boolean;
  /** 状态 */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** 扩展元数据 */
  metadata?: Record<string, unknown>;
}
