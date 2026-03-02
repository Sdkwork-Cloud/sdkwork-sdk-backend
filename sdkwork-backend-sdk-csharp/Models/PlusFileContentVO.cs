using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusFileContentVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? FileId { get; set; }
        public string? FileUuid { get; set; }
        public string? Prompt { get; set; }
        public string? Encoding { get; set; }
        public FileContentObject? Content { get; set; }
    }
}
