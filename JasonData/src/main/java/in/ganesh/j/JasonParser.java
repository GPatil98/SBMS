package in.ganesh.j;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JasonParser {
	
	    public static void main(String[] args) {
	        String json = "[\n" +
	                "    {\n" +
	                "        \"refeance\": [\n" +
	                "            {\n" +
	                "                \"transition\": 1234,\n" +
	                "                \"event\": \"fieldUpdate\",\n" +
	                "                \"from\": {\n" +
	                "                    \"id\": -1,\n" +
	                "                    \"input\": 123\n" +
	                "                }\n" +
	                "            }\n" +
	                "        ]\n" +
	                "    },\n" +
	                "    {\n" +
	                "        \"refeance\": [\n" +
	                "            {\n" +
	                "                \"transition\": 1234,\n" +
	                "                \"event\": \"fieldUpdate\",\n" +
	                "                \"from\": {\n" +
	                "                    \"id\": -1,\n" +
	                "                    \"input\": 123,\n" +
	                "                    \"name\": \"New\",\n" +
	                "                    \"project\": {\n" +
	                "                        \"id\": -2,\n" +
	                "                        \"input\": 456,\n" +
	                "                        \"name\": \"ABC\"\n" +
	                "                    }\n" +
	                "                }\n" +
	                "            }\n" +
	                "        ]\n" +
	                "    }\n" +
	                "]";

	        try {
	            ObjectMapper objectMapper = new ObjectMapper();
	            JsonNode jsonNode = objectMapper.readTree(json);

	            for (JsonNode node : jsonNode) {
	                JsonNode refeanceNode = node.get("refeance");
	                if (refeanceNode != null && refeanceNode.isArray()) {
	                    for (JsonNode refNode : refeanceNode) {
	                        JsonNode projectNode = refNode.path("from").path("project");
	                        if (!projectNode.isMissingNode()) {
	                            String projectName = projectNode.path("name").asText();
	                            System.out.println("Project Name: " + projectName);
	                        }
	                    }
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}



