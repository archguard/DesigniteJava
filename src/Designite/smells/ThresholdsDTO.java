package Designite.smells;

public class ThresholdsDTO {
	
	private int deepHierarchy = 6;
	private int wideHierarchy = 10;
	private int insufficientModularizationLargePublicInterface = 20;
	private int insufficientModularizationLargeNumOfMethods = 30;
	private int insufficientModularizationHighComplexity = 100;
	
	public int getDeepHierarchy() {
		return deepHierarchy;
	}
	
	public void setDeepHierarchy(int deepHierarchy) {
		this.deepHierarchy = deepHierarchy;
	}
	
	public int getWideHierarchy() {
		return wideHierarchy;
	}
	
	public void setWideHierarchy(int wideHierarchy) {
		this.wideHierarchy = wideHierarchy;
	}
	
	public int getInsufficientModularizationLargePublicInterface() {
		return insufficientModularizationLargePublicInterface;
	}
	
	public void setInsufficientModularizationLargePublicInterface(int insufficientModularizationLargePublicInterface) {
		this.insufficientModularizationLargePublicInterface = insufficientModularizationLargePublicInterface;
	}
	
	public int getInsufficientModularizationLargeNumOfMethods() {
		return insufficientModularizationLargeNumOfMethods;
	}
	
	public void setInsufficientModularizationLargeNumOfMethods(int insufficientModularizationLargeNumOfMethods) {
		this.insufficientModularizationLargeNumOfMethods = insufficientModularizationLargeNumOfMethods;
	}
	
	public int getInsufficientModularizationHighComplexity() {
		return insufficientModularizationHighComplexity;
	}
	
	public void setInsufficientModularizationHighComplexity(int insufficientModularizationHighComplexity) {
		this.insufficientModularizationHighComplexity = insufficientModularizationHighComplexity;
	}

}