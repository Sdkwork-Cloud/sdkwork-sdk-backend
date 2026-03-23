import type { ModelFunctionInfo } from './model-function-info';
import type { ModelLimitInfo } from './model-limit-info';
import type { ModelMetadata } from './model-metadata';
import type { ModelPrice } from './model-price';
import type { SceneContent } from './scene-content';
import type { TagsContent } from './tags-content';

/** Enhanced AI Model Information Value Object */
export interface PlusAiModelInfoVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æ¨¡åæ ID */
  objectId?: string;
  /** æ¨¡åæ è¯ç¬¦(å¦"gpt-4","claude-3-opus") */
  model?: string;
  /** æ¨¡åID */
  modelId?: string;
  /** è§èåæ¨¡åé® */
  modelKey?: string;
  /** åååå§æ¨¡åé® */
  vendorModel?: string;
  /** æ¨¡åæ¾ç¤ºåç§°(å¦"GPT-4","Claude 3 Opus") */
  name?: string;
  /** æ¨¡åæè¿° */
  description?: string;
  /** æ¨¡åæä¾å(å¦"OpenAI","Anthropic","Hugging Face") */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** æ¨¡ååå */
  vendor?: 'OPENAI' | 'ANTHROPIC' | 'GOOGLE' | 'META' | 'MICROSOFT' | 'ALIBABA' | 'BAIDU' | 'TENCENT' | 'HUAWEI_CLOUD' | 'IFLYTEK' | 'XAI' | 'AMAZON' | 'ZERO_ONE_AI' | 'ZHIPU_AI' | 'SENSE_TIME' | 'MOONSHOT_AI' | 'DEEPSEEK' | 'MISTRAL_AI' | 'STABILITY_AI' | 'GROQ' | 'HUGGING_FACE' | 'MINIMAX' | 'NVIDIA' | 'OLLAMA' | 'PERPLEXITY' | 'SILICONFLOW' | 'STEPFUN' | 'KUAISHOU';
  /** æ¨¡åçæ¬(å¦"1.0","2023-05-15") */
  modelVersion?: string;
  /** æ¨¡åç³»å(å¦"GPT","Claude","Llama") */
  family?: string;
  /** æ¨¡åAPIç«¯ç¹URL */
  apiEndpoint?: string;
  /** æ¨¡åç±»å(TEXT:ææ¬,IMAGE:å¾å,VIDEO:è§é¢,AUDIO:é³é¢) */
  modelType?: 'CHAT' | 'EMBEDDING' | 'IMAGE' | 'TEXT' | 'VIDEO' | 'AUDIO' | 'MUSIC' | 'MODERATION' | 'NEWS' | 'SEARCH' | 'DOCUMENT' | 'CODE' | 'MEMORY' | 'UNKNOWN';
  /** å®ä»·ç±»å */
  pricingType?: 'FREE' | 'PAID' | 'ENTERPRISE';
  /** çå½å¨æé¶æ®µ */
  lifecycleStage?: 'PREVIEW' | 'GA' | 'DEPRECATED' | 'EOL';
  /** åå¸æ¥æ */
  releaseDate?: string;
  /** åºå¼æ¶é´ */
  deprecatedAt?: string;
  /** ä¸ä¸ætokenæ°é */
  contextTokens?: number;
  /** æå¤§è¾å¥token */
  maxInputTokens?: number;
  /** æå¤§è¾åºtoken */
  maxOutputTokens?: number;
  /** æ¯ææ¨ç */
  supportReasoning?: boolean;
  /** æ¯æå¤æ¨¡æ */
  supportMultimodal?: boolean;
  /** æ¯æå½æ°è°ç¨ */
  supportFunctionCall?: boolean;
  /** æ¯æç»æåè¾åº */
  supportStructuredOutput?: boolean;
  /** æ¯æå®æ¶è½å */
  supportRealtime?: boolean;
  /** æ¯æå¾®è° */
  supportFineTuning?: boolean;
  /** ç­åº¦åå¼ */
  popularityScore?: number;
  /** æ¨¡åææè/ç»ç» */
  ownedBy?: string;
  /** æ¯æåºæ¯ */
  scenes?: SceneContent;
  /** æ¨¡åä»¤çéå¶ä¿¡æ¯ */
  tokenLimit?: ModelLimitInfo;
  /** æ¨¡ååè½ä¿¡æ¯ */
  functionInfo?: ModelFunctionInfo;
  /** æ¨¡åä»·æ ¼ä¿¡æ¯ */
  priceInfo?: ModelPrice;
  /** æ¨¡ååæ°æ®åè½åä¿¡æ¯ */
  metadata?: ModelMetadata;
  /** äº§åæ¯æä¿¡æ¯ */
  productSupportInfo?: Record<string, unknown>;
  /** æ¯æçè¯­é³åè¡¨(ç¨äºææ¬è½¬è¯­é³æ¨¡å) */
  supportedVoices?: string;
  /** é»è®¤æ¸©åº¦è®¾ç½® */
  defaultTemperature?: number;
  /** é»è®¤top_pè®¾ç½® */
  defaultTopP?: number;
  /** é»è®¤é¢çæ©ç½å¼ */
  defaultFrequencyPenalty?: number;
  /** é»è®¤å­å¨æ©ç½å¼ */
  defaultPresencePenalty?: number;
  /** æ¨¡åç¶æ(active:æ´»è·,deprecated:å·²å¼ç¨) */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** æ»ä½¿ç¨æ¬¡æ° */
  usageCount?: number;
  /** å¤ççæ»ä»¤çæ° */
  totalTokens?: number;
  /** å¹³åååºæ¶é´(æ¯«ç§) */
  avgResponseTime?: number;
  /** æ¨¡åæ ç­¾(éå·åé) */
  tags?: TagsContent;
  /** éå éç½®åæ°(JSONæ ¼å¼) */
  configParams?: string;
}
