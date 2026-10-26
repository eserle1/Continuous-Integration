package mmu.quotes; 
import java.io.IOException; 
import java.util.List; 
import java.util.Map; 
public interface QuoteReader { 
List<Map<String, Object>> readQuotes() throws IOException; 
} 