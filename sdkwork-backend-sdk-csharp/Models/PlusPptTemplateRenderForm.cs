using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPptTemplateRenderForm
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Prompt { get; set; }
    }
}
