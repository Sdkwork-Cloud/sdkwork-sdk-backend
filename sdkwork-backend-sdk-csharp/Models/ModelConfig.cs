using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ModelConfig
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? Weight { get; set; }
        public string? Channel { get; set; }
        public string? Product { get; set; }
        public AgentAccountConfig? Agent { get; set; }
        public AppStoreAccountConfig? AppStore { get; set; }
        public ApiKeyAccountConfig? Apikey { get; set; }
        public AudioAccountConfig? Audio { get; set; }
        public CloudAccountConfig? Cloud { get; set; }
        public DatasourceAccountConfig? Datasource { get; set; }
        public EmbeddingAccountConfig? Embedding { get; set; }
        public FilesAccountConfig? Files { get; set; }
        public ImAccountConfig? Im { get; set; }
        public ImageAccountConfig? Image { get; set; }
        public IotAccountConfig? Iot { get; set; }
        public KnowledgeAccountConfig? Knowledge { get; set; }
        public LlmAccountConfig? Llm { get; set; }
        public MemoryAccountConfig? Memory { get; set; }
        public ModerationAccountConfig? Moderation { get; set; }
        public MusicAccountConfig? Music { get; set; }
        public MiniProgramAccountConfig? MiniProgram { get; set; }
        public NewsAccountConfig? News { get; set; }
        public OcrAccountConfig? Ocr { get; set; }
        public OfficialAccountConfig? Official { get; set; }
        public OssAccountConfig? Oss { get; set; }
        public PayAccountConfig? Pay { get; set; }
        public RtcAccountConfig? Rtc { get; set; }
        public SearchAccountConfig? Search { get; set; }
        public SmsAccountConfig? Sms { get; set; }
        public ToolAccountConfig? Tool { get; set; }
        public VectorAccountConfig? Vector { get; set; }
        public VideoAccountConfig? Video { get; set; }
        public AudioAccountConfig? Voice { get; set; }
        public ChannelResourceInfo? Resources { get; set; }
        public Dictionary<string, object>? Properties { get; set; }
        public OAuthAccountConfig? Oauth { get; set; }
    }
}
