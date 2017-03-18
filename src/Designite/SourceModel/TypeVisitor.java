package Designite.SourceModel;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import java.util.ArrayList;
import java.util.List;

public class TypeVisitor extends ASTVisitor{
	private List<SM_Type> types = new ArrayList<SM_Type>();
	private List<TypeDeclaration> typeDeclarationList = new ArrayList<TypeDeclaration>();
	private CompilationUnit compilationUnit;
	private SM_Type newType;
	
	public TypeVisitor(CompilationUnit cu) {
		super();
		this.compilationUnit = cu;
	}
	
	@Override
	public boolean visit(TypeDeclaration typeDeclaration){
		typeDeclarationList.add(typeDeclaration);
		newType = new SM_Type(typeDeclaration, compilationUnit);
		types.add(newType);
		
		return super.visit(typeDeclaration);
	}
	
	public SM_Type getType() {
		return newType;
	}
	
	public List<SM_Type> getTypeList() {
		return types;
	}
	
	public List<TypeDeclaration> getTypeDeclarationList() {
		return typeDeclarationList;
	}
}
