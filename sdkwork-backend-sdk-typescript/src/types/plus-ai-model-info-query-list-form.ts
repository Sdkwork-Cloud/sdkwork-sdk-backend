/** AI model list query form */
export interface PlusAiModelInfoQueryListForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** Keyword for fuzzy search on name/model/modelKey/vendorModel/description */
  keyword?: string;
  /** Filter by channel/provider */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** Filter by model type */
  modelType?: 'CHAT' | 'EMBEDDING' | 'IMAGE' | 'TEXT' | 'VIDEO' | 'AUDIO' | 'MUSIC' | 'MODERATION' | 'NEWS' | 'SEARCH' | 'DOCUMENT' | 'CODE' | 'MEMORY' | 'UNKNOWN';
  /** Filter by model status */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** Filter by model family */
  family?: string;
  /** Filter by model vendor */
  vendor?: 'OPENAI' | 'ANTHROPIC' | 'GOOGLE' | 'META' | 'MICROSOFT' | 'ALIBABA' | 'BAIDU' | 'TENCENT' | 'HUAWEI_CLOUD' | 'IFLYTEK' | 'XAI' | 'AMAZON' | 'ZERO_ONE_AI' | 'ZHIPU_AI' | 'SENSE_TIME' | 'MOONSHOT_AI' | 'DEEPSEEK' | 'MISTRAL_AI' | 'STABILITY_AI' | 'GROQ' | 'HUGGING_FACE' | 'MINIMAX' | 'NVIDIA' | 'OLLAMA' | 'PERPLEXITY' | 'SILICONFLOW' | 'STEPFUN' | 'KUAISHOU';
  /** Filter by open source flag */
  openSource?: boolean;
  /** Filter by pricing type */
  pricingType?: 'FREE' | 'PAID' | 'ENTERPRISE';
  /** Filter by lifecycle stage */
  lifecycleStage?: 'PREVIEW' | 'GA' | 'DEPRECATED' | 'EOL';
  /** Filter by minimum context tokens */
  minContextTokens?: number;
  /** Filter by reasoning capability */
  supportReasoning?: boolean;
  /** Filter by multimodal capability */
  supportMultimodal?: boolean;
  /** Filter by function-call capability */
  supportFunctionCall?: boolean;
  /** Filter by realtime capability */
  supportRealtime?: boolean;
  /** Filter by fine-tuning capability */
  supportFineTuning?: boolean;
}
