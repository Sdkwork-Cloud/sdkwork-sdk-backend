import type { TagsContent } from './tags-content';

/** 语音发音人VO */
export interface PlusVoiceSpeakerVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** ID */
  id?: number;
  /** 发音人名称 */
  name?: string;
  /** 语音 */
  voice?: string;
  /** 关联的模型ID */
  channelSpeakerId?: string;
  /** 发音人代码 */
  code?: string;
  /** 模型提供商(如"OpenAI","Anthropic","Hugging Face") */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** 性别：1-男，2-女，3-中性 */
  gender?: 'DEFAULT' | 'MALE' | 'FEMALE' | 'NEUTRAL' | 'OTHER';
  /** 年龄类型：1-老人，2-成年，3-儿童 */
  ageType?: 'DEFAULT' | 'ELDERLY' | 'ADULT' | 'CHILD';
  /** 发音人类型：1-普通发音人，2-AI发音人 */
  type?: 'DEFAULT' | 'NORMAL' | 'LLM' | 'CLONE';
  /** 关联的模型ID */
  models?: string[];
  /** 标签列表 */
  tags?: TagsContent;
  /** 状态：1-激活，2-未激活，3-弃用 */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DEPRECATED';
  /** 发音人描述 */
  description?: string;
}
