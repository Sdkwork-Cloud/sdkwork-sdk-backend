using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusNotificationForm
    {
        public string? Role { get; set; }
        public int? SenderId { get; set; }
        public Participant? Sender { get; set; }
        public int? ReceiverId { get; set; }
        public Participant? Receiver { get; set; }
        public int? GroupId { get; set; }
        public string? Title { get; set; }
        public string? Content { get; set; }
        public string? Type { get; set; }
        public string? ChannelType { get; set; }
        public string? TemplateId { get; set; }
        public Dictionary<string, object>? TemplateParams { get; set; }
        public string? RedirectUrl { get; set; }
        public string? MiniProgramPath { get; set; }
        public string? Status { get; set; }
        public string? SentAt { get; set; }
        public string? ReadAt { get; set; }
        public Dictionary<string, object>? ExtraData { get; set; }
        public int? RetryCount { get; set; }
        public int? MaxRetryCount { get; set; }
        public string? ErrorMessage { get; set; }
    }
}
