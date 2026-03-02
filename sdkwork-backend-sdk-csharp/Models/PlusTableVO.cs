using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusTableVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public int? ColumnCount { get; set; }
        public int? RowCount { get; set; }
        public string? LastSyncTime { get; set; }
        public string? PrimaryKeys { get; set; }
        public string? Engine { get; set; }
        public string? CreateSql { get; set; }
        public string? Comment { get; set; }
        public int? SchemaId { get; set; }
        public string? SchemaName { get; set; }
        public List<PlusColumnVO>? Columns { get; set; }
    }
}
