using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AgentExecutionContext
    {
        public string? Id { get; set; }
        public string? BizType { get; set; }
        public string? Uuid { get; set; }
        public int? MaxFlowSteps { get; set; }
        public int? FlowSteps { get; set; }
        public int? Threads { get; set; }
        public string? CreateAt { get; set; }
        public int? MaxDuration { get; set; }
        public List<ChatMessageListener>? Listeners { get; set; }
        public string? State { get; set; }
        public ChatContext? ChatContext { get; set; }
        public ShardingContext? ShardingContext { get; set; }
        public Flow? Flow { get; set; }
        public AgentExecutionContext? Root { get; set; }
        public AgentExecutionContext? Parent { get; set; }
        public PlusAgent? Pre { get; set; }
        public PlusAgent? Current { get; set; }
        public ChatResponseHandler? ResponseHandler { get; set; }
        public PlusProjectObject? Project { get; set; }
        public PlusDiskObject? Disk { get; set; }
        public PlusFileObject? DiskRootFile { get; set; }
        public bool? Completed { get; set; }
        public bool? Running { get; set; }
        public bool? Paused { get; set; }
        public bool? Expired { get; set; }
        public bool? Failed { get; set; }
        public bool? Waiting { get; set; }
        public bool? Init { get; set; }
        public bool? End { get; set; }
        public Dictionary<string, AgentScope>? AgentSCOPES { get; set; }
        public bool? OverSteps { get; set; }
    }
}
