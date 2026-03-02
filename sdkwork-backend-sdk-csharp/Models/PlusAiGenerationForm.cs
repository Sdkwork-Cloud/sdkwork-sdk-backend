using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiGenerationForm
    {
        public int? UserId { get; set; }
        public string? RequestId { get; set; }
        public string? Model { get; set; }
        public string? Channel { get; set; }
        public string? Type { get; set; }
        public ImageMediaResourceList? CoverImages { get; set; }
        public AssetMediaResourceList? ResourceList { get; set; }
        public VideoStoryboard? Storyboard { get; set; }
        public AuthorInfo? Author { get; set; }
        public TagsContent? Tags { get; set; }
        public int? PromptId { get; set; }
        public string? ChannelTaskId { get; set; }
        public string? ChannelTaskStatus { get; set; }
        public string? TaskCreatedTime { get; set; }
        public string? TaskUpdatedTime { get; set; }
        public double? Cost { get; set; }
        public string? Status { get; set; }
        public string? RequestTime { get; set; }
        public string? ResponseTime { get; set; }
        public int? UsageRecordId { get; set; }
        public int? ConversationId { get; set; }
        public int? MessageId { get; set; }
    }
}
