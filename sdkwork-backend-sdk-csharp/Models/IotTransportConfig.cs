using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class IotTransportConfig
    {
        public string? Type { get; set; }
        public string? Url { get; set; }
        public int? ConnectionTimeout { get; set; }
        public int? KeepAliveInterval { get; set; }
        public int? Qos { get; set; }
        public string? ClientId { get; set; }
        public string? AuthToken { get; set; }
        public string? Username { get; set; }
        public string? Password { get; set; }
        public bool? SslEnabled { get; set; }
        public bool? CleanSession { get; set; }
        public string? WillTopic { get; set; }
        public string? WillMessage { get; set; }
        public int? WillQos { get; set; }
        public bool? WillRetain { get; set; }
        public List<string>? PublishTopics { get; set; }
        public List<string>? SubscribeTopics { get; set; }
    }
}
