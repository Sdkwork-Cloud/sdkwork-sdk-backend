import type { TagsContent } from './tags-content';

/** Voice speaker creation form */
export interface PlusVoiceSpeakerForm {
  /** Speaker name */
  name: string;
  /** Channel speaker ID */
  channelSpeakerId?: string;
  /** Speaker code */
  code: string;
  /** Channel */
  channel: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** Speaker gender */
  gender: 'DEFAULT' | 'MALE' | 'FEMALE' | 'NEUTRAL' | 'OTHER';
  /** Age type */
  ageType: 'DEFAULT' | 'ELDERLY' | 'ADULT' | 'CHILD';
  /** Speaker type */
  type: 'DEFAULT' | 'NORMAL' | 'LLM' | 'CLONE';
  /** Supported models */
  models: string[];
  /** Tags */
  tags?: TagsContent;
  /** Speaker status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DEPRECATED';
  /** Description */
  description?: string;
}
