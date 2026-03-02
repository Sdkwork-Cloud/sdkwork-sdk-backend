/** Usage record creation form */
export interface UsageRecordForm {
  /** 用户ID */
  userId?: number;
  /** 请求ID(用于跟踪和关联请求) */
  requestId?: string;
  /** 模型名称 */
  modelName: string;
  /** 服务提供商(如OpenAI、Azure、Anthropic等) */
  channel: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** 使用类型(TEXT:文本生成,IMAGE:图片生成,VIDEO:视频生成,AUDIO:语音生成,EMBEDDING:嵌入向量) */
  usageType: 'DEFAULT' | 'TEXT' | 'IMAGE' | 'VIDEO' | 'AUDIO' | 'EMBEDDING' | 'CHAT' | 'TEXT_TO_SPEECH' | 'SPEECH_TO_TEXT' | 'PASS_SMS' | 'PAAS_FILE' | 'OTHER';
  /** 计费类型(TOKEN:按token计费,COUNT:按次数计费,TIME:按时间计费) */
  billingType: 'DEFAULT' | 'TOKEN' | 'COUNT' | 'TIME' | 'DATA_VOLUME' | 'HYBRID';
  /** 输入token数量(TOKEN计费类型适用) */
  promptTokens?: number;
  /** 输出token数量(TOKEN计费类型适用) */
  completionTokens?: number;
  /** 缓存token数量(TOKEN计费类型适用) */
  cachedTokens?: number;
  /** 总token数量(TOKEN计费类型适用) */
  totalTokens?: number;
  /** 调用次数(COUNT计费类型适用) */
  callCount?: number;
  /** 处理时间(毫秒)(TIME计费类型适用) */
  processingTime?: number;
  /** 图片数量(IMAGE使用类型适用) */
  imageCount?: number;
  /** 图片尺寸(如1024x1024)(IMAGE使用类型适用) */
  imageSize?: string;
  /** 视频时长(秒)(VIDEO使用类型适用) */
  videoDuration?: number;
  /** 音频时长(秒)(AUDIO使用类型适用) */
  audioDuration?: number;
  /** 实际费用 */
  cost?: number;
  /** 货币单位(如USD、CNY等) */
  currencyCode?: 'USD' | 'EUR' | 'GBP' | 'JPY' | 'AUD' | 'CAD' | 'CHF' | 'CNY' | 'SEK' | 'NZD' | 'BRL' | 'INR' | 'RUB' | 'ZAR' | 'SGD' | 'HKD' | 'KRW' | 'MXN' | 'TRY' | 'ILS' | 'POINT' | 'TOKEN';
  /** 状态(SUCCESS:成功,FAILED:失败) */
  status: 'DEFAULT' | 'SUCCESS' | 'FAILED' | 'PARTIAL_SUCCESS' | 'TIMEOUT' | 'CANCELLED' | 'PROCESSING' | 'QUEUED';
  /** 请求时间 */
  requestTime?: string;
  /** 响应时间 */
  responseTime?: string;
  /** 关联的提示语ID */
  promptId?: number;
  /** 关联的工具ID */
  toolId?: number;
}
