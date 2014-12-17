import org.objectweb.asm.Label;
import org.objectweb.asm.MethodAdapter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class MethodPrinter extends MethodAdapter {

	int access;
	String exceptionThrown;
	
	public MethodPrinter(MethodVisitor mv) {
		super(mv);
	}

	public void setException(String e) {
		this.exceptionThrown = e;
	}
	public void visitMethodInsn(int opcode, String owner, String name,
			String desc) {
		if(name.equals("<init>"))
			System.out.println("Construtor de "+ owner);
		super.visitMethodInsn(opcode, owner, name, desc);
		System.out.println("opcode: "+opcode+" owner: "+owner+" name: "+name+" desc: "+desc);
	}
	
//	public void visitMaxs(int maxStack, int maxLocals) {
//		System.out.println("Max size of the stack: "+maxStack + " Max # of local varialbe "+maxLocals);
//    }
	
	@Override
	public void visitInsn(int arg0) {
		// TODO Auto-generated method stub
		if(arg0 == Opcodes.ATHROW)
			System.out.println("Throw exception");
		super.visitInsn(arg0);
	}
	
	@Override
	public void visitTryCatchBlock(Label arg0, Label arg1, Label arg2,
			String type) {
		// TODO Auto-generated method stub
		super.visitTryCatchBlock(arg0, arg1, arg2, type);
		System.out.println("visit trycatch block "+type);
		System.out.println("Exception thrown: "+ this.exceptionThrown);
		//this.visitInsn(Opcodes.ATHROW);
	}
//	public void visitLabel(final Label label) {
//		System.out.println("Label: "+label);
//		super.visitLabel(label);
//	}
	
	/*public void visitLineNumber(final int line, final Label start) {
		System.out.println("label "+start + " line "+line);
		super.visitLineNumber(line, start);
	}*/

}
