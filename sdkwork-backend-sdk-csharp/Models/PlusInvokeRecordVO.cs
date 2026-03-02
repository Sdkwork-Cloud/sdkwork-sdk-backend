using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusInvokeRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Type { get; set; }
        public string? ApiEndpoint { get; set; }
        public string? FunctionName { get; set; }
        public Dictionary<string, object>? RequestParams { get; set; }
        public Dictionary<string, object>? Headers { get; set; }
        public string? Status { get; set; }
        public int? Duration { get; set; }
        public string? ErrorMsg { get; set; }
        public int? UserId { get; set; }
        public string? ClientIp { get; set; }
        public string? ClientLocation { get; set; }
        public string? UserAgent { get; set; }
        public string? BrowserInfo { get; set; }
        public string? ClientId { get; set; }
    }
}
