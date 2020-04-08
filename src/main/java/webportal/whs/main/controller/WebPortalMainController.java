package webportal.whs.main.controller;



import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


@Controller
public class WebPortalMainController {

	@RequestMapping(value = "/index.do")
	public String hello(Model model, @RequestParam(value = "name", required = false) String name) {

		return "/main/indexMain";
	}
	

	
	@RequestMapping(value = "/termOfUse.do")
	public String ternOfUse() throws UnirestException, ParseException {

		
		
		/*
		 * Unirest.setTimeouts(0, 0); HttpResponse<JsonNode> response = Unirest.post(
		 * "https://devByteInterface.amwestfunding.com/api/ByteLogin/GetLoginProfile")
		 * .header("Authorization",
		 * "Basic YXM6ODEwMTBhMWYtZTcyOS00ODgzLThhYTQtMjg3NTI4ZGJlOTgz")
		 * .header("Content-Type", "application/json")
		 * .body("{    \"RequestDataAsJson\":" +
		 * "		   \"{\\\"userName\\\":\\\"Test.Broker\\\"," +
		 * "		   \\\"password\\\":\\\"GZxeH25+hpLu5MA6WyUing==\\\"}\"," +
		 * "    	   \r\n\"Requestor\": { " + "        \"UserId\": 0," +
		 * "        \"UserName\": null," + "        \"FullName\": \"\"," +
		 * "        \"Email\": null," + "        \"OrganizationID\": 0," +
		 * "        \"OriginationChannel\": 3," + "        \"SecurityProfileID\": 0," +
		 * "        \"SecurityProfile\": null," + "        \"IPAddress\": \"\"    }," +
		 * "        \"RequestTime\": \"2020-01-27T11:57:14.4370423-08:00\"}\r\n\r\n")
		 * 
		 * .asJson();
		 * 
		 * org.json.JSONObject aaa = response.getBody().getObject();
		 * 
		 * 
		 * System.out.println("aaa===============>"+aaa);
		 * 
		 * 
		 * String IsSuccess= aaa.get("IsSuccess").toString(); String ResponseDataAsJson=
		 * aaa.get("ResponseDataAsJson").toString();
		 * 
		 * System.out.println("IsSuccess===============>"+IsSuccess);
		 * System.out.println("ResponseDataAsJson===============>"+ResponseDataAsJson);
		 * 
		 * 
		 * 
		 * 
		 * JSONParser jsonParser = new JSONParser(); JSONObject jsonObj = (JSONObject)
		 * jsonParser.parse(ResponseDataAsJson); JSONArray tableArray = (JSONArray)
		 * jsonObj.get("Table");
		 * 
		 * System.out.println("tableArray====>"+tableArray);
		 */
 

 
  
		//////////////////////////////////////////////////////////////////////////////////////////
		
		return "/main/term_of_use";
	}	
	
	
	
	
	
	
	
}