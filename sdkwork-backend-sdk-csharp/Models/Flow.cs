using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class Flow
    {
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Status { get; set; }
        public List<Node>? Nodes { get; set; }
        public List<EdgeObject>? Edges { get; set; }
        public List<Flow>? SubFlows { get; set; }
        public int? ParentId { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public Flow? ParentFlow { get; set; }
        public List<PlusAgent>? AllAgents { get; set; }
        public Node? LastNode { get; set; }
    }
}
