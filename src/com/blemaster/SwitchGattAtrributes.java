package com.blemaster;
	import java.util.HashMap;
public class SwitchGattAtrributes {
	/**
	 * This class includes a small subset of standard GATT attributes for demonstration purposes.
	 */
	    private static HashMap<String, String> attributes = new HashMap<String, String>();
	    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
	    public static String SWITCH_CLIENT = "0000fff1-0000-1000-8000-00805f9b34fb";

	    static {
	        // Sample Services.
	        attributes.put(SWITCH_CLIENT, "Switch Service");
	        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
	        // Sample Characteristics.
	        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
	    }

	    public static String lookup(String uuid, String defaultName) {
	        String name = attributes.get(uuid);
	        return name == null ? defaultName : name;
	    }
}
