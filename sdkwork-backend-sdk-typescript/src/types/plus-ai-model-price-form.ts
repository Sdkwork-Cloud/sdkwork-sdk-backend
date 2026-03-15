/** Model price creation form */
export interface PlusAiModelPriceForm {
  /** Model object ID */
  objectId: string;
  /** Model alias */
  model: string;
  /** Model ID */
  modelId?: number;
  /** Channel */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** Canonical model key */
  modelKey?: string;
  /** Product code */
  productCode?: string;
  /** Feature code */
  featureCode?: string;
  /** Billing type */
  billingType?: 'TOKEN' | 'REQUEST' | 'DURATION' | 'CHARACTER' | 'IMAGE' | 'VIDEO_SECOND' | 'AUDIO_SECOND' | 'STORAGE_MB' | 'TIERED' | 'SUBSCRIPTION' | 'FREE';
  /** Price item type */
  priceItemType?: 'INPUT' | 'BATCH_INPUT' | 'CACHED_INPUT' | 'BATCH_CACHED_INPUT' | 'OUTPUT' | 'BATCH_OUTPUT' | 'COUNT' | 'DURATION';
  /** Tier name */
  tierName?: string;
  /** Rule priority */
  rulePriority?: number;
  /** Pricing unit */
  unit: 'TOKEN' | 'K_TOKEN' | 'M_TOKEN' | 'COUNT' | 'DURATION';
  /** Unit size */
  unitSize?: number;
  /** Base price */
  price?: number;
  /** Input price */
  inputPrice?: number;
  /** Batch input price */
  batchInputPrice?: number;
  /** Cached input price */
  cachedInputPrice?: number;
  /** Batch cached input price */
  batchCachedInputPrice?: number;
  /** Output price */
  outputPrice?: number;
  /** Batch output price */
  batchOutputPrice?: number;
  /** Currency */
  currency: 'USD' | 'EUR' | 'GBP' | 'JPY' | 'AUD' | 'CAD' | 'CHF' | 'CNY' | 'SEK' | 'NZD' | 'BRL' | 'INR' | 'RUB' | 'ZAR' | 'SGD' | 'HKD' | 'KRW' | 'MXN' | 'TRY' | 'ILS' | 'POINT' | 'TOKEN';
  /** Minimum usage */
  minUsage?: number;
  /** Maximum usage */
  maxUsage?: number;
  /** Effective from */
  effectiveFrom?: string;
  /** Effective to */
  effectiveTo?: string;
  /** Whether default rule */
  defaultRule?: boolean;
  /** Status */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** Additional metadata */
  metadata?: Record<string, unknown>;
}
