package fr.insalyon.creatis.vip.java_client.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import org.junit.Test;

import fr.insalyon.creatis.vip.java_client.model.Execution;
import fr.insalyon.creatis.vip.java_client.model.PipelineParameter;

public class ApiChangesTest {
	@Test
	public void inputValueTest() throws Exception{		
		Method m = Execution.class.getMethod("getInputValues");
		Class<?> methodClass = m.getReturnType();
		assertEquals(Map.class, methodClass);
	}
		
	@Test
	public void defaultValueTest(){
		Field[] pipelineParameterFields = PipelineParameter.class.getDeclaredFields();
		Method methodGet = null;
		for (Field field : pipelineParameterFields){
			if (field.getName().equals("defaultValue")) {
				Class<?> fieldClass = field.getType();
				if(Object.class.equals(fieldClass)){
					try{
						methodGet = PipelineParameter.class.getMethod("getDefaultValue");
						PipelineParameter.class.getMethod("setDefaultValue", Object.class);
					}catch(NoSuchMethodException e){
						throw new RuntimeException("method \"setDefaultValue\" or/and \"getDefaultValue\"in PipelineParameter class are missing");
					}
					Class<?> methodGetClass = methodGet.getReturnType();
					assertTrue(methodGetClass.equals(Object.class));
					return;
				}
			}
		}
		throw new RuntimeException("No field named \"defaultValue\" in PipelineParameter class");
	}
}