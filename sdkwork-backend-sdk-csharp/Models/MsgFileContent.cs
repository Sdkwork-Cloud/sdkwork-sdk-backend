using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class MsgFileContent
    {
        public string? Content { get; set; }
        public FileMediaResource? Resource { get; set; }
    }
}
