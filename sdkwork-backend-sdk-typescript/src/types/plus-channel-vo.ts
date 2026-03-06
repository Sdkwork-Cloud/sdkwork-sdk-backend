/** Channel VO */
export interface PlusChannelVO {
  /** Created time */
  createdAt?: string;
  /** Updated time */
  updatedAt?: string;
  /** Primary key ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** Owner user id */
  userId?: number;
  /** Channel name */
  name?: string;
  /** Channel provider */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** Channel types */
  types?: 'DEFAULT' | 'VIDEO' | 'LLM' | 'CLOUD' | 'PLATFORM' | 'PAYMENT' | 'COMPONENT' | 'API'[];
  /** Supported resources */
  supportResources?: 'LLM' | 'CLOUD' | 'PAY' | 'SEARCH' | 'VIDEO' | 'SPEECH' | 'EMBEDDING' | 'FILES' | 'MODERATION' | 'AUDIO' | 'MUSIC' | 'NEWS' | 'IMAGE' | 'VECTOR_STORE' | 'MEMORY' | 'KNOWLEDGE_BASE' | 'DATA_SOURCE' | 'AGENT' | 'OAUTH' | 'TOOL' | 'PROMPT' | 'SMS' | 'OFFICIAL_ACCOUNT' | 'MINI_PROGRAM' | 'OCR' | 'APPSTORE' | 'OBJECT_STORAGE' | 'RTC' | 'IM' | 'IOT'[];
  /** Channel status */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** Channel description */
  description?: string;
}
