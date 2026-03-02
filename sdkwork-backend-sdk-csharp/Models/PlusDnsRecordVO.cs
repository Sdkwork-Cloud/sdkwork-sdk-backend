using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusDnsRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? DomainId { get; set; }
        public string? RecordName { get; set; }
        public string? FileName { get; set; }
        public string? FileContent { get; set; }
        public string? RecordType { get; set; }
        public DnsRecordValue? RecordValue { get; set; }
        public int? Ttl { get; set; }
        public int? Priority { get; set; }
        public bool? Enabled { get; set; }
        public string? FirstRecordValue { get; set; }
        public List<string>? RecordValues { get; set; }
    }
}
