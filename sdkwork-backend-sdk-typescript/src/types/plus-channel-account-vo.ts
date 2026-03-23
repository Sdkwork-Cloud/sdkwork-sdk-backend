import type { ChannelConfigInfo } from './channel-config-info';

/** æ¸ éè´¦æ·VOï¼ç¨äºå±ç¤ºç¬¬ä¸æ¹æ¸ éè¿æ¥è´¦æ·ä¿¡æ¯ï¼å¦å¾®ä¿¡å¬ä¼å·ãééæºå¨äººç­ */
export interface PlusChannelAccountVO {
  /** åå»ºæ¶é´ï¼å®ä½é¦æ¬¡æä¹åæ¶è®¾ç½® */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ï¼å®ä½ä¿®æ¹æ¶æ´æ° */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** ç¨æ·ID(å¤é®å³èplus_user.id) */
  userId?: number;
  /** æ¸ éè´¦æ·åç§°(ç®¡ççé¢æ¾ç¤ºç¨) */
  name?: string;
  /** æ¸ éæä¾å(å¦WECHAT, DINGTALK, ALIPAY, FEISHU) */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** æ¨¡åéç½®åæ°(JSONç»æï¼åå«æ¨¡åç±»åãAPIå¯é¥ç­) */
  configs?: ChannelConfigInfo;
  /** è´¦æ·ç¶æ(ACTIVE:å¯ç¨, DISABLED:ç¦ç¨, EXPIRED:è¿æ) */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** æ¸ éè´¦æ·æè¿°(ä½¿ç¨åºæ¯ãæ³¨æäºé¡¹ç­) */
  description?: string;
}
