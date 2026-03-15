/** Usage record creation form */
export interface UsageRecordForm {
  /** User ID */
  userId?: number;
  /** Request ID */
  requestId: string;
  /** Model name */
  modelName?: string;
  /** Channel */
  channel: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** Usage type */
  usageType: 'DEFAULT' | 'TEXT' | 'IMAGE' | 'VIDEO' | 'AUDIO' | 'EMBEDDING' | 'CHAT' | 'TEXT_TO_SPEECH' | 'SPEECH_TO_TEXT' | 'PASS_SMS' | 'PAAS_FILE' | 'OTHER';
  /** Billing type */
  billingType: 'DEFAULT' | 'TOKEN' | 'COUNT' | 'TIME' | 'DATA_VOLUME' | 'HYBRID';
  /** Prompt tokens */
  promptTokens?: number;
  /** Completion tokens */
  completionTokens?: number;
  /** Cached tokens */
  cachedTokens?: number;
  /** Total tokens */
  totalTokens?: number;
  /** Call count */
  callCount?: number;
  /** Processing time in milliseconds */
  processingTime?: number;
  /** Image count */
  imageCount?: number;
  /** Image size */
  imageSize?: string;
  /** Video duration in seconds */
  videoDuration?: number;
  /** Audio duration in seconds */
  audioDuration?: number;
  /** Usage cost */
  cost?: number;
  /** Currency code */
  currencyCode?: 'USD' | 'EUR' | 'GBP' | 'JPY' | 'AUD' | 'CAD' | 'CHF' | 'CNY' | 'SEK' | 'NZD' | 'BRL' | 'INR' | 'RUB' | 'ZAR' | 'SGD' | 'HKD' | 'KRW' | 'MXN' | 'TRY' | 'ILS' | 'POINT' | 'TOKEN';
  /** Usage status */
  status: 'DEFAULT' | 'SUCCESS' | 'FAILED' | 'PARTIAL_SUCCESS' | 'TIMEOUT' | 'CANCELLED' | 'PROCESSING' | 'QUEUED';
  /** Request time */
  requestTime?: string;
  /** Response time */
  responseTime?: string;
  /** Prompt ID */
  promptId?: number;
  /** Tool ID */
  toolId?: number;
}
