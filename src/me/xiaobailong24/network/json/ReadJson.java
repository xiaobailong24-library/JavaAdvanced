package me.xiaobailong24.network.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

/**
 * https://mvnrepository.com/artifact/com.google.code.gson/gson/2.7
 * 
 * @author LiuYinlong
 *
 */
public class ReadJson {

	String jsonPath = "H:/Android/Work/Study/JavaAdvanced/test.json";

	public static void main(String[] args) {
		try {
			JsonParser parser = new JsonParser();
			JsonObject object = (JsonObject) parser.parse(new FileReader(
					"test.json"));

			System.out.println("cat=" + object.get("cat").getAsString());
			System.out.println("pop=" + object.get("pop").getAsBoolean());

			JsonArray array = object.get("languages").getAsJsonArray();
			for (JsonElement jsonElement : array) {
				System.out.println("-----------------");
				JsonObject subObject = (JsonObject) jsonElement;
				System.out.println("id=" + subObject.get("id").getAsInt());
				System.out.println("name="
						+ subObject.get("name").getAsString());
				System.out.println("ide=" + subObject.get("ide").getAsString());
			}

		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
