/** AIæ¨¡åä½¿ç¨è®°å½VOï¼ç¨äºè®°å½åç§AIæ¨¡åè°ç¨çä½¿ç¨æåµ */
export interface UsageRecordVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ç¨æ·ID */
  userId?: number;
  /** è¯·æ±ID(ç¨äºè·è¸ªåå³èè¯·æ±) */
  requestId?: string;
  /** æ¨¡ååç§° */
  modelName?: string;
  /** æå¡æä¾å(å¦OpenAIãAzureãAnthropicç­) */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** ä½¿ç¨ç±»å(TEXT:ææ¬çæ,IMAGE:å¾ççæ,VIDEO:è§é¢çæ,AUDIO:è¯­é³çæ,EMBEDDING:åµå¥åé) */
  usageType?: 'DEFAULT' | 'TEXT' | 'IMAGE' | 'VIDEO' | 'AUDIO' | 'EMBEDDING' | 'CHAT' | 'TEXT_TO_SPEECH' | 'SPEECH_TO_TEXT' | 'PASS_SMS' | 'PAAS_FILE' | 'OTHER';
  /** è®¡è´¹ç±»å(TOKEN:ætokenè®¡è´¹,COUNT:ææ¬¡æ°è®¡è´¹,TIME:ææ¶é´è®¡è´¹) */
  billingType?: 'DEFAULT' | 'TOKEN' | 'COUNT' | 'TIME' | 'DATA_VOLUME' | 'HYBRID';
  /** è¾å¥tokenæ°é(TOKENè®¡è´¹ç±»åéç¨) */
  promptTokens?: number;
  /** è¾åºtokenæ°é(TOKENè®¡è´¹ç±»åéç¨) */
  completionTokens?: number;
  /** ç¼å­tokenæ°é(TOKENè®¡è´¹ç±»åéç¨) */
  cachedTokens?: number;
  /** æ»tokenæ°é(TOKENè®¡è´¹ç±»åéç¨) */
  totalTokens?: number;
  /** è°ç¨æ¬¡æ°(COUNTè®¡è´¹ç±»åéç¨) */
  callCount?: number;
  /** å¤çæ¶é´(æ¯«ç§)(TIMEè®¡è´¹ç±»åéç¨) */
  processingTime?: number;
  /** å¾çæ°é(IMAGEä½¿ç¨ç±»åéç¨) */
  imageCount?: number;
  /** å¾çå°ºå¯¸(å¦1024x1024)(IMAGEä½¿ç¨ç±»åéç¨) */
  imageSize?: string;
  /** è§é¢æ¶é¿(ç§)(VIDEOä½¿ç¨ç±»åéç¨) */
  videoDuration?: number;
  /** é³é¢æ¶é¿(ç§)(AUDIOä½¿ç¨ç±»åéç¨) */
  audioDuration?: number;
  /** å®éè´¹ç¨ */
  cost?: number;
  /** è´§å¸åä½(å¦USDãCNYç­) */
  currencyCode?: 'USD' | 'EUR' | 'GBP' | 'JPY' | 'AUD' | 'CAD' | 'CHF' | 'CNY' | 'SEK' | 'NZD' | 'BRL' | 'INR' | 'RUB' | 'ZAR' | 'SGD' | 'HKD' | 'KRW' | 'MXN' | 'TRY' | 'ILS' | 'POINT' | 'TOKEN';
  /** ç¶æ(SUCCESS:æå,FAILED:å¤±è´¥) */
  status?: 'DEFAULT' | 'SUCCESS' | 'FAILED' | 'PARTIAL_SUCCESS' | 'TIMEOUT' | 'CANCELLED' | 'PROCESSING' | 'QUEUED';
  /** è¯·æ±æ¶é´ */
  requestTime?: string;
  /** ååºæ¶é´ */
  responseTime?: string;
  /** å³èçæç¤ºè¯­ID */
  promptId?: number;
  /** å³èçå·¥å·ID */
  toolId?: number;
}
