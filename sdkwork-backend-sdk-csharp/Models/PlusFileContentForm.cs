using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusFileContentForm
    {
        public int? FileId { get; set; }
        public string? FileUuid { get; set; }
        public string? Prompt { get; set; }
        public string? Encoding { get; set; }
        public FileContentObject? Content { get; set; }
    }
}
