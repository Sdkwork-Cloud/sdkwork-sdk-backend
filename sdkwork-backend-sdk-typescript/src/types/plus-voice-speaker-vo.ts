import type { TagsContent } from './tags-content';

/** è¯­é³åé³äººVO */
export interface PlusVoiceSpeakerVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ID */
  id?: number;
  /** åé³äººåç§° */
  name?: string;
  /** è¯­é³ */
  voice?: string;
  /** å³èçæ¨¡åID */
  channelSpeakerId?: string;
  /** åé³äººä»£ç  */
  code?: string;
  /** æ¨¡åæä¾å(å¦"OpenAI","Anthropic","Hugging Face") */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** æ§å«ï¼1-ç·ï¼2-å¥³ï¼3-ä¸­æ§ */
  gender?: 'DEFAULT' | 'MALE' | 'FEMALE' | 'NEUTRAL' | 'OTHER';
  /** å¹´é¾ç±»åï¼1-èäººï¼2-æå¹´ï¼3-å¿ç«¥ */
  ageType?: 'DEFAULT' | 'ELDERLY' | 'ADULT' | 'CHILD';
  /** åé³äººç±»åï¼1-æ®éåé³äººï¼2-AIåé³äºº */
  type?: 'DEFAULT' | 'NORMAL' | 'LLM' | 'CLONE';
  /** å³èçæ¨¡åID */
  models?: string[];
  /** æ ç­¾åè¡¨ */
  tags?: TagsContent;
  /** ç¶æï¼1-æ¿æ´»ï¼2-æªæ¿æ´»ï¼3-å¼ç¨ */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DEPRECATED';
  /** åé³äººæè¿° */
  description?: string;
}
