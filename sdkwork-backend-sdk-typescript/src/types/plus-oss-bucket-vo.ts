/** OSSå­å¨æ¡¶å¼å¯¹è±¡ */
export interface PlusOssBucketVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** å­å¨æ¡¶ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** çæ¬å· */
  v?: number;
  /** ç¨æ·ID */
  userId?: number;
  /** å­å¨æ¡¶åç§° */
  name?: string;
  /** å­å¨æ¡¶æå¨åºå */
  region?: string;
  /** æ¨¡åæä¾å(å¦"OpenAI","Anthropic","Hugging Face") */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** æ¸ ééç½®ID */
  channelConfigId?: number;
  /** å­å¨æ¡¶æè¿°ä¿¡æ¯ */
  description?: string;
  /** å­å¨æ¡¶ç¶æ */
  status?: string;
  /** å­å¨æ¡¶åå»ºæ¶é´ */
  creationDate?: string;
  /** å­å¨æ¡¶ARN */
  arn?: string;
  /** å­å¨æ¡¶è®¿é®åå */
  endpoint?: string;
  /** å­å¨ç±»å */
  storageClass?: string;
  /** æ¯å¦å¯ç¨çæ¬æ§å¶ */
  versioningEnabled?: boolean;
  /** æ¯å¦å å¯ */
  encryptionEnabled?: boolean;
  /** å å¯ç±»å */
  encryptionType?: string;
  /** è®¿é®æ§å¶åè¡¨ */
  acl?: string;
}
