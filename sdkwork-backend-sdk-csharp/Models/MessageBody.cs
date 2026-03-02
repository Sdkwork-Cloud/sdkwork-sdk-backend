using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class MessageBody
    {
        public string? Id { get; set; }
        public ChatCompletion? Completion { get; set; }
        public MsgPayload? Payload { get; set; }
        public ChatCompletionChunk? Chunk { get; set; }
        public AudioMediaResource? AudioFrame { get; set; }
        public Dictionary<string, GroupInfo>? GroupInfos { get; set; }
        public Dictionary<string, List<ChatCompletionChunk>>? Groups { get; set; }
        public int? ThinkStart { get; set; }
        public int? ThinkEnd { get; set; }
        public ChatState? State { get; set; }
    }
}
