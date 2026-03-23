import type { TagsContent } from './tags-content';
import type { VoiceMotion } from './voice-motion';
import type { VoiceStyle } from './voice-style';

export interface VoiceSpeakerInfo {
  /** è¯­é³æå¡æä¾å */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** è¯­é³æå¡æä¾å */
  provider?: 'ALIYUN' | 'TENCENT' | 'OPENAI' | 'HUGGING_FACE' | 'AZURE' | 'GOOGLE' | 'BAIDU';
  /** è¯­é³æ¨¡åäº§ååç§° */
  product?: string;
  /** æ¨¡åå¯ä¸æ è¯ç¬¦ï¼ç±AIæå¡æä¾åæä¾ï¼ */
  id?: string;
  /** è¯­é³æ¨¡åéç½®ä¿¡æ¯ */
  models?: string[];
  /** åé³äººId */
  speakerId?: string;
  /** æ¾ç¤ºçè¯­é³åç§° */
  displayName?: string;
  /** è¯­é³æ ç­¾ */
  tags?: TagsContent;
  /** è¯­é³ææ */
  motion?: VoiceMotion;
  /** è¯­é³é£æ ¼ */
  style?: VoiceStyle;
  /** è¯­é³æè¿°ä¿¡æ¯ */
  description?: string;
}
