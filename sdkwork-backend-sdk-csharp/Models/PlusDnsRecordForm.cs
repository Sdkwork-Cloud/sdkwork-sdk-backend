using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusDnsRecordForm
    {
        public int? DomainId { get; set; }
        public string? RecordName { get; set; }
        public string? FileName { get; set; }
        public string? FileContent { get; set; }
        public string? RecordType { get; set; }
        public DnsRecordValue? RecordValue { get; set; }
        public int? Ttl { get; set; }
        public int? Priority { get; set; }
        public bool? Enabled { get; set; }
    }
}
