package br.com.sergio.utils;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.serenitybdd.core.pages.WebElementFacade;

public class ConfigUtil {

	private static final String FOLDER_NAME = "execucoes";
	static WebElementFacade webElementFacede;

	public static String actualFolderName = "c:\\temp";

	public static String getFolderName() {
		String folderName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		String pathBase = System.getProperty("user.dir");
		return Paths.get(pathBase, FOLDER_NAME, folderName).toString();
	}
	
	
	
}
