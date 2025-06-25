package pojos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FormatPojo 
{
	
	@JsonProperty("Datess")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "[A-Z]{4}[0-9]{4}[A-Z]")
    private String Datess;

    public String getDatess() 
    {
        return Datess;
    }
    
    public String setDatess(String Datess)
    {
    	return this.Datess=Datess;
    }

}
