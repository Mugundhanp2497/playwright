package filereader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import constants.ConfigurationProperties;
import constants.Constants;
import exception.PropertyFileUsageException;

public final class ConfigurationPropertyReader {

	private static Properties property = new Properties();
	
	private static final Map<String, String> CONFIGMAP = new HashMap<>();
	
	private ConfigurationPropertyReader() {}
	
	static {
		try(FileInputStream file = new FileInputStream(Constants.configurationPropertyFilePath))  {
			property.load(file);
			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()).toUpperCase(),
						String.valueOf(entry.getValue()).trim());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static String get(ConfigurationProperties key){
		
		if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toUpperCase()))) {
			throw new PropertyFileUsageException("Property name " + key+ " is not found."
					+ "Please check configuration.properties file");
		}
		return CONFIGMAP.get(key.name().toUpperCase());
	}
}
