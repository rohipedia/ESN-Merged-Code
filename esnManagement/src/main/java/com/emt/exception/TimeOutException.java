package com.emt.exception;

import java.util.HashMap;
import lombok.extern.slf4j.Slf4j;
import java.util.Map;



@Slf4j

public class TimeOutException extends RuntimeException {

		private static final long serialVersionUID = 42L;

		/**
		 * Any miscellaneous error data to be passed on to the Handlers.
		 */
		private Map<String, Object> extraErrorData;

		public TimeOutException(String message, Throwable cause) {
			super(message, cause);
		}

		public TimeOutException(String message) {
			super(message);
		}

		public TimeOutException(Throwable cause) {
			super(cause);
		}

		/**
		 * Add Error Data
		 * 
		 * @param key
		 * @param data
		 */
		public void addErrorData(String key, Object data) {
			if (extraErrorData == null) {
				// Create a Map with initial capacity of 5, instead of the default
				// of 16
				extraErrorData = new HashMap<String, Object>(5);
			}
			log.info("Adding error data for the error having key" +key);
			extraErrorData.put(key, data);
		}

		/**
		 * Get a Particular Error Data.
		 * 
		 * @param key
		 */
		public Object getErrorData(String key) {
			if (this.extraErrorData == null) {
				log.info("No error data found for the error having key"+key);
				return null;
			}
			
			log.info("Fetching error data for the error having key" +key);
			return this.extraErrorData.get(key);
		}
	}
