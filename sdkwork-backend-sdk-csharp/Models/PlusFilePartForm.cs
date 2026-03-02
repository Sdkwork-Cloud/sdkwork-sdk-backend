using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusFilePartForm
    {
        public int? FileId { get; set; }
        public int? ChunkIndex { get; set; }
        public int? ChunkSize { get; set; }
        public int? TotalSize { get; set; }
        public string? Checksum { get; set; }
        public int? Status { get; set; }
        public string? StoragePath { get; set; }
    }
}
