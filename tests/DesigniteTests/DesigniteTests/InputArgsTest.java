package DesigniteTests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;
import Designite.InputArgs;

public class InputArgsTest extends DesigniteTests {

	// Negative case- folder path specified rather than input batch file
	@Test(expected = IllegalArgumentException.class)
	public void testInputArgs_negative_folder() {
		new InputArgs(getTestingPath());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInputArgs_negative_invalidPath() {
		new InputArgs(getTestingPath() + File.separator + "invalidFile.txt");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInputArgs_negative_notFolderPath() {
		new InputArgs(getTestingPath() + File.separator + "TestFiles" + File.separator + "singleJavaFile.txt");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInputArgs_negative_invalidContents() {
		new InputArgs(getTestingPath()+ File.separator + "TestFiles" + File.separator + "invalidBatchFile.txt");
	}

	@Test
	public void testInputArgs_sourceFolder() {
		createFileForArguments(IN_BATCH_FILE_PATH, IN_BATCH_FILE_CONTENT);
		InputArgs args = new InputArgs(IN_BATCH_FILE_PATH);
		assertEquals(System.getProperty("user.dir"), args.getSourceFolder());
	}

	@Test
	public void testInputArgs_outputFolder() {
		createFileForArguments(IN_BATCH_FILE_PATH, IN_BATCH_FILE_CONTENT);
		InputArgs args = new InputArgs(IN_BATCH_FILE_PATH);
		assertEquals(System.getProperty("user.dir") + File.separator + "temp", args.getOutputFolder());
	}
	
	@Test
	public void testInputArgs_getProjectName() {
		createFileForArguments(IN_BATCH_FILE_PATH, IN_BATCH_FILE_CONTENT);
		InputArgs args = new InputArgs(IN_BATCH_FILE_PATH);
		String currentProjectDir = new File(System.getProperty("user.dir")).getName();
		assertEquals(currentProjectDir, args.getProjectName());
	}
	
	@Test
	public void testInputArgs_getProjectName_src() {
		createFileForArguments(IN_BATCH_FILE_PATH, IN_BATCH_FILE_CONTENT_SRC);
		InputArgs args = new InputArgs(IN_BATCH_FILE_PATH);
		String currentProjectDir = new File(System.getProperty("user.dir")).getName();
		assertEquals(currentProjectDir, args.getProjectName());
	}
	
	@Test
	public void testInputArgs_getProjectName_source() {
		createFileForArguments(IN_BATCH_FILE_PATH, IN_BATCH_FILE_CONTENT_SOURCE);
		InputArgs args = new InputArgs(IN_BATCH_FILE_PATH);
		String currentProjectDir = new File(System.getProperty("user.dir")).getName();
		assertEquals(currentProjectDir, args.getProjectName());
	}
}