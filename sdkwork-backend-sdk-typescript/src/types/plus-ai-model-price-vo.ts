/** AIæ¨¡åä»·æ ¼VO */
export interface PlusAiModelPriceVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æ¨¡åæ ID */
  objectId?: string;
  /** æ¨¡åæ è¯ç¬¦(å¦"gpt-4","claude-3-opus") */
  model?: string;
  /** æ¨¡åä¸»é®ID */
  modelId?: number;
  /** æ¸ é */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** è§èåæ¨¡åé® */
  modelKey?: string;
  /** äº§åç¼ç  */
  productCode?: string;
  /** åè½ç¼ç  */
  featureCode?: string;
  /** è®¡è´¹ç±»å */
  billingType?: 'TOKEN' | 'REQUEST' | 'DURATION' | 'CHARACTER' | 'IMAGE' | 'VIDEO_SECOND' | 'AUDIO_SECOND' | 'STORAGE_MB' | 'TIERED' | 'SUBSCRIPTION' | 'FREE';
  /** ä»·æ ¼é¡¹ç±»å */
  priceItemType?: 'INPUT' | 'BATCH_INPUT' | 'CACHED_INPUT' | 'BATCH_CACHED_INPUT' | 'OUTPUT' | 'BATCH_OUTPUT' | 'COUNT' | 'DURATION';
  /** æ¡£ä½åç§° */
  tierName?: string;
  /** è§åä¼åçº§ */
  rulePriority?: number;
  /** ä»·æ ¼è®¡éåä½ */
  unit?: 'TOKEN' | 'K_TOKEN' | 'M_TOKEN' | 'COUNT' | 'DURATION';
  /** è®¡éåä½å¤§å° */
  unitSize?: number;
  /** åºç¡ä»·æ ¼ */
  price?: number;
  /** è¾å¥ä»·æ ¼ */
  inputPrice?: number;
  /** æ¹éè¾å¥ä»·æ ¼ */
  batchInputPrice?: number;
  /** ç¼å­è¾å¥ä»·æ ¼ */
  cachedInputPrice?: number;
  /** æ¹éç¼å­è¾å¥ä»·æ ¼ */
  batchCachedInputPrice?: number;
  /** è¾åºä»·æ ¼ */
  outputPrice?: number;
  /** æ¹éè¾åºä»·æ ¼ */
  batchOutputPrice?: number;
  /** è´§å¸ç±»å */
  currency?: 'USD' | 'EUR' | 'GBP' | 'JPY' | 'AUD' | 'CAD' | 'CHF' | 'CNY' | 'SEK' | 'NZD' | 'BRL' | 'INR' | 'RUB' | 'ZAR' | 'SGD' | 'HKD' | 'KRW' | 'MXN' | 'TRY' | 'ILS' | 'POINT' | 'TOKEN';
  /** æå°ä½¿ç¨é */
  minUsage?: number;
  /** æå¤§ä½¿ç¨é */
  maxUsage?: number;
  /** çæå¼å§æ¶é´ */
  effectiveFrom?: string;
  /** çæç»ææ¶é´ */
  effectiveTo?: string;
  /** æ¯å¦é»è®¤è§å */
  defaultRule?: boolean;
  /** ç¶æ */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** æ©å±åæ°æ® */
  metadata?: Record<string, unknown>;
}
